package com.astach.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {

    @GetMapping("/signUp")
    public String signUp(){
        return "registr.html";
    }

}
