package com.disney.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenProvider {

    private final String SECRET = "4qhq8LrEBfYcaRHxhdb9zURb2rf8e7Ud";
    private final Long EXPIRATION_MILISECONDS = 3600000L;

    public String generateToken(String userName, String email){

        Date expirationDate = new Date(System.currentTimeMillis() + EXPIRATION_MILISECONDS);

        Map<String, Object> extra = new HashMap<>();
        extra.put("userName", userName);

        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(Keys.hmacShaKeyFor(this.SECRET.getBytes()))
                .compact();

    }

    public UsernamePasswordAuthenticationToken getAuthentication(String token){

        try {

            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(SECRET.getBytes())
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
