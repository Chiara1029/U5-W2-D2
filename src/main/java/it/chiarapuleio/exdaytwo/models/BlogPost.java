package it.chiarapuleio.exdaytwo.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BlogPost {
    private int id;
    private String category;
    private String title;
    private String cover;   //   "http://picsum.photos/200/300"
    private String content;
    private LocalDate readingTime;

    public BlogPost(int id, String category, String title, String cover, String content, LocalDate readingTime) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.cover = cover;
        this.content = content;
        this.readingTime = readingTime;
    }
}
