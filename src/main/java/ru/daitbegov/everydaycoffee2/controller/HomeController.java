package ru.daitbegov.everydaycoffee2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.daitbegov.everydaycoffee2.service.ProductService;

@Controller
public class HomeController {
    private final ProductService productService;

    @Autowired
    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "file/homePage";
    }

}
