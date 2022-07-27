package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {
    @GetMapping("/firstview")
    public String returnFirstView(Model vModel) {
        vModel.addAttribute("name", "Chase");
        return "first-view";
    }

    @GetMapping("/citysearch")
    public String returnCitySearchForm() {
        return "city-search";
    }

    @PostMapping("/citysearch")
    public String returnCitySearchResults(@RequestParam String query, Model vModel) {
        vModel.addAttribute("search", query);
        return "city-search-results";
    }
}
