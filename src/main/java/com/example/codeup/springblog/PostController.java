package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String getAllPosts(){
        return "Posts index page.";
    }

    @GetMapping("posts/{id}")
    @ResponseBody
    public String getPost(@PathVariable String id){
        return "Viewing post id: " + id;
    }

    @GetMapping("posts/create")
    @ResponseBody
    public String getCreatePostForm(){
        return "Form to create post...";
    }

    @PostMapping("posts/create")
    @ResponseBody
    public String savePost(){
        return "Saving post...";
    }
}
