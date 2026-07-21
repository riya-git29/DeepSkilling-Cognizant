package com.authdemo.centralizedauthenticationdemo.jwt;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.web.filter.OncePerRequestFilter;

public class JwtTokenFilter
        extends OncePerRequestFilter {

    @Autowired
    private JwtTokenProvider provider;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain chain)
            throws ServletException, IOException {

        String token =
                request.getHeader("Authorization");

        if (token != null &&
                token.startsWith("Bearer ")) {

            token =
                    token.substring(7);

            if (provider.validateToken(token)) {

                SecurityContextHolder
                        .getContext();
            }
        }

        chain.doFilter(
                request,
                response);
    }
}