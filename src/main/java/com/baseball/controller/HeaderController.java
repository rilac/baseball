package com.baseball.controller;

import com.baseball.DTO.RegisterDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HeaderController {

    @GetMapping("/")
    public String index(Model model){
        return "login";
    }


    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("RegisterForm", new RegisterDTO());
        return "signup";
    }

    @GetMapping("/virtualmatch")
    public String virtualmatch(Model model){
        return "virtualmatch";
    }

    @GetMapping("/matches")
    public String matches(){
        return "matches";
    }

    @GetMapping("/board")
    public String board(){
        return "board";
    }

    @GetMapping("/userinfo")
    public String userinfo(){
        return "userinfo";
    }

    @GetMapping("/single")
    public String single(){
        return "single";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/selectteam")
    public String selectteam(){
        return "selectteam";
    }

}
