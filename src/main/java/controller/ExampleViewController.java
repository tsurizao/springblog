package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleViewController {
    @GetMapping("/helloworld")
    public String returnHelloWorld(Model vModel){
        vModel.addAttribute("name", "Chase");
        return "hello-world";
    }
}
