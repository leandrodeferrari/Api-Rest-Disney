package com.disney.security.service.impl;

import com.disney.security.dto.LoginInDto;
import com.disney.security.dto.LoginOutDto;
import com.disney.security.dto.RegisterInDto;
import com.disney.security.dto.RegisterOutDto;
import com.disney.security.jwt.JwtTokenProvider;
import com.disney.security.mapper.IAuthMapper;
import com.disney.security.model.Role;
import com.disney.security.model.User;
import com.disney.security.model.UserDetailsImpl;
import com.disney.security.repository.IUserRepository;
import com.disney.security.model.enums.RoleEnum;
import com.disney.security.service.IAuthService;
import com.disney.security.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.disney.security.config.SecurityConfig.passwordEncoder;

@Service
public class AuthServiceImpl implements IAuthService {

    private final IAuthMapper authMapper;
    private final IRoleService roleService;
    private final UserDetailsServiceImpl userDetailsServiceImpl;
    private final IUserRepository userRepository;
    private final AuthenticationManager authManager;
    private final JwtTokenProvider jwtTokenProvider;

    @Autowired
    public AuthServiceImpl(AuthenticationManager authManager, IAuthMapper authMapper, IRoleService roleService, IUserRepository userRepository, JwtTokenProvider jwtTokenProvider, UserDetailsServiceImpl userDetailsServiceImpl){
        this.authManager = authManager;
        this.authMapper = authMapper;
        this.roleService = roleService;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userRepository = userRepository;
        this.userDetailsServiceImpl = userDetailsServiceImpl;
    }

    @Transactional
    @Override
    public RegisterOutDto register(RegisterInDto registerInDto) {

        User user = authMapper.registerInDtoToUser(registerInDto);
        user.setCreationDate(LocalDateTime.now());
        user.setUpdateDate(LocalDateTime.now());
        user.setPassword(passwordEncoder().encode(user.getPassword()));

        List<Role> roles = new ArrayList<>();
        roles.add(roleService.findByName(RoleEnum.USER.getName()));
        user.setRoles(roles);

        userRepository.save(user);

        return authMapper.userToRegisterOutDto(user);

    }

    @Override
    public LoginOutDto login(LoginInDto loginInDto) {

        authManager.authenticate(new UsernamePasswordAuthenticationToken(loginInDto.getUserNameOrEmail(), loginInDto.getPassword()));

        final UserDetailsImpl userDetails = userDetailsServiceImpl.loadUserByUsername(loginInDto.getUserNameOrEmail());

        String token = jwtTokenProvider.generateToken(userDetails);

        return new LoginOutDto(loginInDto.getUserNameOrEmail(), token);

    }

}
