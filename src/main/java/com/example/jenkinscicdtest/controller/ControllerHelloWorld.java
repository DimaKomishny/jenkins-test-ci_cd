package com.example.jenkinscicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHelloWorld {

    @GetMapping("/hello")
        public String getHello() {
            return "Check SCM trigger";
        }
    }
