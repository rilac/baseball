package com.baseball.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class BasicController {

    @GetMapping("/")
    public String index(Model model){
        return "login";
    }


    @GetMapping("/register")
    public String register(Model model){
        return "signup";
    }

    @GetMapping("/test")
    public String test(Model model){
        return "virtualmatch";
    }
}
