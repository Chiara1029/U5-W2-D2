package it.chiarapuleio.exdaytwo.controllers;

import it.chiarapuleio.exdaytwo.models.Author;
import it.chiarapuleio.exdaytwo.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    // GET Lista autore
    // GET singolo autore
    // POST new autore
    // PUT modifica autore
    // DELETE elimina autore

    @Autowired
    private AuthorService authSrv;

    @GetMapping
    public List<Author> getAuthors() {
        return this.authSrv.getAuthors();
    }
}
