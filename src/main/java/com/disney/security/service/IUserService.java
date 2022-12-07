package com.disney.security.service;

import com.disney.security.dto.UserDto;
import org.springframework.data.domain.Page;

public interface IUserService {

    void deleteById(Long id);

    Page<UserDto> getAll(Integer pageNumber);

    UserDto update(String userName, String password);

}
