package com.disney.security.service.impl;

import com.disney.exception.BadRequestException;
import com.disney.exception.UnauthorizedException;
import com.disney.security.dto.UserDto;
import com.disney.security.mapper.IUserMapper;
import com.disney.security.model.Role;
import com.disney.security.model.User;
import com.disney.security.model.enums.RoleEnum;
import com.disney.security.repository.IUserRepository;
import com.disney.security.service.IUserService;
import com.disney.security.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static com.disney.security.config.SecurityConfig.passwordEncoder;

@Service
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;
    private final IUserMapper userMapper;

    @Autowired
    public UserServiceImpl(IUserMapper userMapper, IUserRepository userRepository){
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public void deleteById(Long id) {

        User user = userRepository.findById(id).orElseThrow();

        String loggedUserNameOrEmail = SecurityContextHolder.getContext().getAuthentication().getName();
        User loggedUser = userRepository.findByUserNameOrEmail(loggedUserNameOrEmail, loggedUserNameOrEmail).orElseThrow();
        Long loggedUserId = loggedUser.getId();
        List<Role> loggedUserRoles = loggedUser.getRoles();

        if(!loggedUserId.equals(id) && loggedUserRoles.stream().noneMatch(role -> role.getName().equals(RoleEnum.ADMIN.getName()))){

            throw new UnauthorizedException("You are wanting to delete a user that does not belong to you");

        }

        if(user.isSoftDelete()){

            throw new BadRequestException("The user is already deleted");

        }
        
        userRepository.deleteById(id);

    }

    @Override
    public List<UserDto> getAll() {
        return userRepository.findAll().stream().map(userMapper::userToUserDto).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public UserDto update(String userName, String password) {

        UserUtil.validateUserNameAndPassword(userName, password);

        String loggedUserNameOrEmail = SecurityContextHolder.getContext().getAuthentication().getName();
        User loggedUser = userRepository.findByUserNameOrEmail(loggedUserNameOrEmail, loggedUserNameOrEmail).orElseThrow();

        if(userName != null){

            UserUtil.validateBlankInUserName(userName);
            loggedUser.setUserName(userName);

        }

        if(password != null){

            UserUtil.validateBlankInPassword(password);
            loggedUser.setPassword(passwordEncoder().encode(password));

        }

        loggedUser.setUpdateDate(LocalDateTime.now());

        return userMapper.userToUserDto(loggedUser);

    }

}
