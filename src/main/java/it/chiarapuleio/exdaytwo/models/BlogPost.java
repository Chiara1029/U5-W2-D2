package it.chiarapuleio.exdaytwo.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Setter
public class BlogPost {
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private LocalDate readingTime;

    public BlogPost(String category, String title, String content, LocalDate readingTime) {
        Random rnd = new Random();
        this.id = rnd.nextInt(1, 1000);
        this.category = category;
        this.title = title;
        this.cover = "http://picsum.photos/200/300";
        this.content = content;
        this.readingTime = readingTime;
    }
}
