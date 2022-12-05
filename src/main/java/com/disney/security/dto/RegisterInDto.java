package com.disney.security.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class RegisterInDto implements Serializable {

    @NotBlank(message = "The username cannot be blank")
    @NotNull(message = "The username cannot be null")
    private String userName;

    @Email(message = "You must enter an email")
    @NotBlank(message = "The email cannot be blank")
    @NotNull(message = "The email cannot be null")
    private String email;

    @NotBlank(message = "The password cannot be blank")
    @NotNull(message = "The password cannot be null")
    @Size(min = 8, message = "The password cannot be less than 8 characters")
    private String password;

}
