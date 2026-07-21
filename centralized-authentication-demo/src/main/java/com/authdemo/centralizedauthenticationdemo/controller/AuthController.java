package com.authdemo.centralizedauthenticationdemo.controller;

import com.authdemo.jwt.JwtTokenProvider;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtTokenProvider provider;

    @GetMapping("/token")
    public String token() {

        return provider.createToken(
                "riya");
    }
}