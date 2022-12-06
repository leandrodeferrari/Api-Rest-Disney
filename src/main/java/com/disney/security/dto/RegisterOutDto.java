package com.disney.security.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RegisterOutDto implements Serializable {

    private String userName;
    private String email;
    private String creationDate;
    private String token;

}
