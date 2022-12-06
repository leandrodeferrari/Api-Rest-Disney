package com.disney.security.service;

import com.disney.security.dto.UserDto;

import java.util.List;

public interface IUserService {

    void deleteById(Long id);

    List<UserDto> getAll();

}
