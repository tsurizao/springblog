package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.constant.Constable;
import java.util.ArrayList;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String getAllPosts(Model model){
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post("Post 1", "The body for post 1");
        Post post2 = new Post("Post 2", "The body of Post 2");
        posts.add(post1);
        posts.add(post2);
        model.addAttribute("posts", posts);
        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable String id, Model model){
        model.addAttribute("post", new Post("A title", "The body"));
        return "/posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm(){
        return "Form to create post...";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String savePost(){
        return "Saving post...";
    }
}
