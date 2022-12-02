package com.disney.security.model;

import lombok.Data;

@Data
public class AuthCredentials {

    private String userNameOrEmail;
    private String password;

}
