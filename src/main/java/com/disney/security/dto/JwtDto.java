package com.disney.security.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class JwtDto implements Serializable {

    private String token;
    private final String type = "Bearer ";

}
