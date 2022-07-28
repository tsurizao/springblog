package controller;

import com.example.codeup.springblog.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String getAllPosts(Model model){
        ArrayList<Post> posts = new ArrayList<>(Arrays.asList(
                new Post(1, "Post 1", "The body for post 1"),
                new Post(1, "Post 1", "The body for post 2")
        ));
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable long id, Model model){
        model.addAttribute("post", new Post(1, "A title", "The body"));
        return "posts/show";
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
