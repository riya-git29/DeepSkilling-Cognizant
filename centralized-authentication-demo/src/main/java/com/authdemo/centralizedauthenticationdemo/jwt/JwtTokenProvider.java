package com.authdemo.centralizedauthenticationdemo.jwt;

import io.jsonwebtoken.*;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.authdemo.config.JwtConfig;

@Component
public class JwtTokenProvider {

    @Autowired
    private JwtConfig jwtConfig;

    public String createToken(
            String username) {

        Claims claims =
                Jwts.claims()
                        .setSubject(username);

        Date now = new Date();

        Date validity =
                new Date(
                        now.getTime() + 3600000);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(validity)
                .signWith(
                        SignatureAlgorithm.HS256,
                        jwtConfig.getSecret())
                .compact();
    }

    public boolean validateToken(
            String token) {

        try {
            Jwts.parser()
                    .setSigningKey(
                            jwtConfig.getSecret())
                    .parseClaimsJws(token);

            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}