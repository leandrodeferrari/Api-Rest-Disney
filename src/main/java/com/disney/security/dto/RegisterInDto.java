package com.disney.security.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class RegisterInDto implements Serializable {

    @NotBlank @NotNull
    private String userName;
    @Email @NotBlank @NotNull
    private String email;
    @NotBlank @NotNull
    private String password;

}
