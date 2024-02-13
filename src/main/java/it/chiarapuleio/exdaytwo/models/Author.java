package it.chiarapuleio.exdaytwo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
public class Author {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
    private String avatar; //  http://ui-avatars.com/api/?name=Mario+Rossi  generato automaticamente dal server

    public Author(String name, String surname, String email, LocalDate dateOfBirth, String avatar) {
        Random rnd = new Random();
        this.id = rnd.nextInt(1, 1000);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.avatar = avatar;
    }
}
