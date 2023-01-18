package com.astach.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @RequestMapping("/landing")
    public String getLanding(){
        return "landing.html";
    }
}
