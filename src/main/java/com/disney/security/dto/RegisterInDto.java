package com.disney.security.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class RegisterInDto implements Serializable {

    @NotBlank @NotNull
    private String userName;
    @Email @NotBlank @NotNull
    private String email;
    @NotBlank @NotNull @Size(min = 8)
    private String password;

}
