package com.authdemo.centralizedauthenticationdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SecureController {

    @GetMapping("/secure")
    public String secure() {

        return "This is a secure endpoint";
    }
}