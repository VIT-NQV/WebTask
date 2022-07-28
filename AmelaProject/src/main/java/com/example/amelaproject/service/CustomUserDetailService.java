package com.example.amelaproject.service;

import com.example.amelaproject.entity.UserEntity;
import com.example.amelaproject.repository.UserRepository;
import com.example.amelaproject.entity.AccountDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findAllByUsername(username);

        if (userEntity == null) {
            throw new UsernameNotFoundException("User not found");
        }

        AccountDetail account = new AccountDetail(userEntity);

        return account;
    }
}
