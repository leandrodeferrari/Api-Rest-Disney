package com.disney.security.service;

import com.disney.security.dto.LoginInDto;
import com.disney.security.dto.LoginOutDto;
import com.disney.security.dto.RegisterInDto;
import com.disney.security.dto.RegisterOutDto;

public interface IAuthService {

    RegisterOutDto register(RegisterInDto registerInDto);

    LoginOutDto login(LoginInDto loginInDto);

}
