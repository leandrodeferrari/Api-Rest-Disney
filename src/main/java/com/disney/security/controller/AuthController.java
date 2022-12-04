package com.disney.security.controller;

import com.disney.security.dto.LoginInDto;
import com.disney.security.dto.LoginOutDto;
import com.disney.security.dto.RegisterInDto;
import com.disney.security.dto.RegisterOutDto;
import com.disney.security.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final IAuthService authService;

    @Autowired
    public AuthController(IAuthService authService){
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterOutDto> register(@Valid @RequestBody RegisterInDto registerInDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(authService.register(registerInDto));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginOutDto> login(@Valid @RequestBody LoginInDto loginInDto){
        return ResponseEntity.ok().body(authService.login(loginInDto));
    }

}
