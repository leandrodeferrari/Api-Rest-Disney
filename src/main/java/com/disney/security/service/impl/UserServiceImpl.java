package com.disney.security.service.impl;

import com.disney.exception.BadRequestException;
import com.disney.exception.UnauthorizedException;
import com.disney.security.model.Role;
import com.disney.security.model.User;
import com.disney.security.model.enums.RoleEnum;
import com.disney.security.repository.IUserRepository;
import com.disney.security.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    @Autowired
    public UserServiceImpl(IUserRepository userRepository){
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

        user.setSoftDelete(true);

    }

}
