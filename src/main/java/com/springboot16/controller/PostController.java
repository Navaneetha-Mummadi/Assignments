package com.springboot16.controller;

import com.springboot16.model.Post;
import com.springboot16.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public Post[] getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable int id) {
        return postService.getPostById(id);
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @PutMapping("/{id}")
    public String updatePost(@PathVariable int id, @RequestBody Post post) {
        postService.updatePost(id, post);
        return "Post updated";
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable int id) {
        postService.deletePost(id);
        return "Post deleted";
    }
}