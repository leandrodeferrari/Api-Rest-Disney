package com.disney.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenProvider {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expirationInMiliseconds;

    public String generateToken(String userName, String email){

        Date expirationDate = new Date(System.currentTimeMillis() + this.expirationInMiliseconds);

        Map<String, Object> extra = new HashMap<>();
        extra.put("userName", userName);

        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(Keys.hmacShaKeyFor(this.secret.getBytes()))
                .compact();

    }

    public UsernamePasswordAuthenticationToken getAuthentication(String token){

        try {

            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(secret.getBytes())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();

            String userNameOrEmail = claims.getSubject();

            return new UsernamePasswordAuthenticationToken(userNameOrEmail, null, Collections.emptyList());

        } catch (JwtException ex){

            return null;

        }

    }

}
