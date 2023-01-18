package com.astach.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String getProfilePage(){
        return "important.html";
    }
}
