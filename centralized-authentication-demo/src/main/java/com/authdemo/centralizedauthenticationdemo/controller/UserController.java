package com.authdemo.centralizedauthenticationdemo.controller;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
public class UserController {

    @GetMapping("/user")
    public Principal user(
            Principal principal) {

        return principal;
    }
}