package com.disney.security.service.impl;

import com.disney.security.model.User;
import com.disney.security.model.UserDetailsImpl;
import com.disney.security.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final IUserRepository userRepository;

    @Autowired
    public UserDetailsServiceImpl(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetailsImpl loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {

        User user = userRepository.findByUserNameOrEmail(usernameOrEmail, usernameOrEmail).orElseThrow();

        return new UserDetailsImpl(user);

    }

}
