package com.example.codeup.springblog.controllers;

import com.example.codeup.springblog.models.Post;
import com.example.codeup.springblog.models.User;
import com.example.codeup.springblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.codeup.springblog.repositories.PostRepository;

import java.util.List;

@Controller
public class PostController {

    UserRepository userDao;
    PostRepository postDao;

    public PostController(PostRepository postDao, UserRepository userDao){
        this.postDao = postDao;
        this.userDao = userDao;
    }

    @GetMapping("/posts")
    public String getAllPosts(Model model){
        List<Post> posts = postDao.findAll();
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable long id, Model model){
        Post post = postDao.findById(id).get();
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String createPost(Model model){
        model.addAttribute("newPost", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post){
        User user = userDao.findById(1L).get();
        post.setUser(user);
        postDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/delete/{id}")
    public String deletePost(@PathVariable long id){
        postDao.deleteById(id);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPost(Model model, @PathVariable long id){
        Post post = postDao.findById(id).get();
        model.addAttribute("post", post);
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post){
        User user = userDao.findById(1L).get();
        post.setUser(user);
        postDao.save(post);
        return "redirect:/posts";
    }
}
