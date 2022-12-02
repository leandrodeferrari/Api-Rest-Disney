package com.disney.security.service.impl;

import com.disney.security.dto.RegisterInDto;
import com.disney.security.dto.RegisterOutDto;
import com.disney.security.mapper.IAuthMapper;
import com.disney.security.model.Role;
import com.disney.security.model.User;
import com.disney.security.repository.IRoleRepository;
import com.disney.security.repository.IUserRepository;
import com.disney.security.model.enums.RoleEnum;
import com.disney.security.service.IAuthService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.disney.security.config.SecurityConfig.passwordEncoder;

@Service
public class AuthServiceImpl implements IAuthService {

    private final IAuthMapper authMapper;
    private final IRoleRepository roleRepository;
    private final IUserRepository userRepository;

    public AuthServiceImpl(IAuthMapper authMapper, IRoleRepository roleRepository, IUserRepository userRepository){
        this.authMapper = authMapper;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public RegisterOutDto register(RegisterInDto registerInDto) {

        User user = authMapper.registerInDtoToUser(registerInDto);
        user.setCreationDate(LocalDateTime.now());
        user.setUpdateDate(LocalDateTime.now());
        user.setSoftDelete(false);
        List<Role> roles = new ArrayList<>();
        roles.add(roleRepository.findByName(RoleEnum.USER.getName()).orElseThrow());
        user.setRoles(roles);

        user.setPassword(passwordEncoder().encode(user.getPassword()));

        userRepository.save(user);

        return authMapper.userToRegisterOutDto(user);

    }

}
