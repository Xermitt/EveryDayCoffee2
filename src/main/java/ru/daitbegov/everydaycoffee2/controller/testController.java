package ru.daitbegov.everydaycoffee2.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("message", "Hello World");
        return "file/test";
    }
}
