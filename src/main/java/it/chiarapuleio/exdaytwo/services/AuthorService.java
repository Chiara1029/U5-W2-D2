package it.chiarapuleio.exdaytwo.services;

import it.chiarapuleio.exdaytwo.models.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class AuthorService {
    private List<Author> authors = new ArrayList<>();

    public List<Author> getAuthors() {
        return this.authors;
    }

    public Author saveAuthor(Author newAuthor) {
        this.authors.add(newAuthor);
        return newAuthor;
    }

    public Author findById(int id) {
        Author found = null;
        for (Author author : this.authors) {
            if (author.getId() == id) {
                found = author;
            }
        }
        return found;
    }

    public Author findByIdAndUpdate(int id, Author newAuthor) {
        Author found = null;
        for (Author author : this.authors) {
            if (newAuthor.getId() == id) {
                found = newAuthor;
                found.setName(newAuthor.getName());
                found.setSurname(newAuthor.getSurname());
                found.setDateOfBirth(newAuthor.getDateOfBirth());
                found.setEmail(newAuthor.getEmail());
            }
        }
        return found;
    }

    public void findByIdAndDelete(int id) {
        Iterator<Author> i = this.authors.iterator();
        while (i.hasNext()) {
            Author current = i.next();
            if (current.getId() == id) {
                i.remove();
            }
        }
    }
}
