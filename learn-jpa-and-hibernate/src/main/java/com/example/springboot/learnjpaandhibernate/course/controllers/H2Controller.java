package com.example.springboot.learnjpaandhibernate.course.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class H2Controller {

    @RequestMapping("/")
    public String displayH2Console() {
        return "h2-console";
    }
}
