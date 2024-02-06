package com.example.chineseblackjack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.chineseblackjack.models.User;


@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user, Model model){
        System.out.println(user.toString());
        model.addAttribute("firstName", user.getFname());
        model.addAttribute("lastName", user.getLname());
        return "welcome";
    }
}
