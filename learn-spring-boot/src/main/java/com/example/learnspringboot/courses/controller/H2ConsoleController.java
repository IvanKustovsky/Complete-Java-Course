package com.example.learnspringboot.courses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class H2ConsoleController {

    @RequestMapping(value = {"", "/"})
    public String openH2Console(){
        return "/h2-console";
    }
}
