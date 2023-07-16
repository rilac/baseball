package com.baseball.controller;

import com.baseball.DTO.RegisterDTO;
import com.baseball.domain.Members;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ActionsController {
    @PostMapping("/register")
    public String RegisterAction(RegisterDTO form){
        Members member = new Members();
        member.setUserid(form.id);
        member.setName(form.name);
        member.setEmail(form.email);
        member.setPassword(form.password);

        return "redirect:/";
    }

}
