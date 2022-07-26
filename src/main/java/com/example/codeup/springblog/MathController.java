package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/{operation}/{num1}/{filler}/{num2}")
    @ResponseBody
    public String arithmatic(@PathVariable String operation, @PathVariable int num1, @PathVariable int num2) {
        if (operation.equals("add")) {
            return num1 + " plus " + num2 + " equals " + (num1 + num2);
        } else if (operation.equals("subtract")) {
            return num2 + " minus " + num1 + " equals " + (num2 - num1);
        } else if (operation.equals("multiply")) {
            return num1 + " times " + num2 + " equals " + (num1 * num2);
        } else if (operation.equals("divide")) {
            return num1 + " divided by " + num2 + " equals " + (num1 / num2);
        } else {
            return "Please enter the correct operation and numbers... for example /subtract/4/from/5";
        }
    }
}
