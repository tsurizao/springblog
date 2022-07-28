package com.example.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String returnRollDiceForm() {
        return "roll-dice";
    }

    @PostMapping("/roll-dice/{num}")
    public String returnRollDiceWithPath(@PathVariable String num, Model vModel) {
        int diceRoll = (int) (Math.random() * 6 + 1);
        boolean isCorrect = Integer.parseInt(num) == diceRoll;
        vModel.addAttribute("roll", diceRoll);
        vModel.addAttribute("guess", num);
        vModel.addAttribute("correct", isCorrect);
        return "rolled-dice";
    }
}
