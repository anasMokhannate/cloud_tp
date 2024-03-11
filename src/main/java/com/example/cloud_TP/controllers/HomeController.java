package com.example.cloud_TP.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String indexPage(Model model){
        model.addAttribute("Title","SpringBoot x TailwindCSS");
        return "home";
    }
}
