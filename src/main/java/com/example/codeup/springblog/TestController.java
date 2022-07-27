package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String returnCitySearchResults(@RequestParam String query, Model vmodel) {
        vmodel.addAttribute("search", query);
        return "city-search-results";
    }
}
