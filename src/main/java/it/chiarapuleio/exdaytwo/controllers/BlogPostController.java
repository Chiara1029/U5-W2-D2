package it.chiarapuleio.exdaytwo.controllers;

import it.chiarapuleio.exdaytwo.models.BlogPost;
import it.chiarapuleio.exdaytwo.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostController {

    @Autowired
    private BlogPostService bpSrv;

    @GetMapping
    public List<BlogPost> getPosts() {
        return this.bpSrv.getAllPosts();
    }

    @GetMapping("/{id}")
    public BlogPost findById(@PathVariable int id) {
        return this.bpSrv.findById(id);
    }

    @PostMapping
    public BlogPost savePost(@RequestBody BlogPost newPost) {
        return this.bpSrv.savePost(newPost);
    }

    @PutMapping("/{id}")
    public BlogPost findByIdAndUpdate(@PathVariable int id, @RequestBody BlogPost newPost) {
        return this.bpSrv.findByIdAndUpdate(id, newPost);
    }

    @DeleteMapping("/{id}")
    public void findByIdAndDelete(@PathVariable int id) {
        this.bpSrv.findByIdAndDelete(id);
    }
}
