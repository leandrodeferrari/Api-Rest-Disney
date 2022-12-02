package com.disney.security.jwt;

import com.disney.security.model.AuthCredentials;
import com.disney.security.model.UserDetailsImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

@NoArgsConstructor
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final JwtTokenProvider jwtTokenProvider = new JwtTokenProvider();

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response) throws AuthenticationException {

        AuthCredentials authCredentials = new AuthCredentials();

        try {

            authCredentials = new ObjectMapper().readValue(request.getReader(), AuthCredentials.class);

        } catch(IOException ex){

            return null;

        }

        UsernamePasswordAuthenticationToken userNamePAT = new UsernamePasswordAuthenticationToken(
                authCredentials.getUserNameOrEmail(),
                authCredentials.getPassword(),
                Collections.emptyList()
        );


        return getAuthenticationManager().authenticate(userNamePAT);

    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {

        UserDetailsImpl userDetails = (UserDetailsImpl) authResult.getPrincipal();

        String token = jwtTokenProvider.generateToken(userDetails.getUsername(), userDetails.getEmail());

        response.addHeader("Authorization", "Bearer " + token);
        response.getWriter().flush();

        super.successfulAuthentication(request, response, chain, authResult);

    }

}
