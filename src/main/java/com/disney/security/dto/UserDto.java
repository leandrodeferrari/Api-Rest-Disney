package com.disney.security.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {

    private Long id;
    private String userName;
    private String email;
    private String creationDate;
    private String updateDate;

}
