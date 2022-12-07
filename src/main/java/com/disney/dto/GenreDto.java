package com.disney.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class GenreDto {

    @NotBlank(message = "The name cannot be blank")
    @NotNull(message = "The name cannot be null")
    private String name;

    @NotBlank(message = "The url image cannot be blank")
    private String urlImage;

}
