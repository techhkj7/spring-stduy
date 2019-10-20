package com.techhkj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringStudyController {

    @GetMapping("/test")
    public String SpringStudyController() {
        return "Hello world";
    }
}
