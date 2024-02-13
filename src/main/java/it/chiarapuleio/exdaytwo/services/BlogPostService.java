package it.chiarapuleio.exdaytwo.services;

import it.chiarapuleio.exdaytwo.models.BlogPost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class BlogPostService {
    public List<BlogPost> blogPosts = new ArrayList<>();

    public List<BlogPost> getAllPosts() {
        return this.blogPosts;
    }

    public BlogPost savePost(BlogPost newPost) {
        this.blogPosts.add(newPost);
        return newPost;
    }

    public BlogPost findById(int id) {
        BlogPost found = null;
        for (BlogPost blogPost : this.blogPosts) {
            if (blogPost.getId() == id) {
                found = blogPost;
            }
        }
        return found;
    }

    public BlogPost findByIdAndUpdate(int id, BlogPost newPost) {
        BlogPost found = null;
        for (BlogPost blogPost : this.blogPosts) {
            if (newPost.getId() == id) {
                found = newPost;
                found.setCategory(newPost.getCategory());
                found.setTitle(newPost.getTitle());
                found.setContent(newPost.getContent());
                found.setReadingTime(newPost.getReadingTime());
            }
        }
        return found;
    }

    public void findByIdAndDelete(int id) {
        Iterator<BlogPost> i = this.blogPosts.iterator();
        while (i.hasNext()) {
            BlogPost current = i.next();
            if (current.getId() == id) {
                i.remove();
            }
        }
    }
}
