package com.example.amelaproject.service;

import com.example.amelaproject.entity.UserEntity;
import com.example.amelaproject.repository.UserRepository;
import com.example.amelaproject.service.impl.UserDetailImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDeatilService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findAllByUsername(username);
        return new UserDetailImpl(userEntity);
    }
}
