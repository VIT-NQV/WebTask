package com.example.amelaproject.service.impl;

import com.example.amelaproject.entity.UserEntity;
import com.example.amelaproject.repository.UserRepository;
import com.example.amelaproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserEntity AddUser(UserEntity user){
        return userRepo.save(user);
    }

    @Override
    public Boolean check(UserEntity user) {
        List<UserEntity> userentity = userRepo.findAll();

        for (UserEntity userCheck:userentity) {
            if (user.getPassword().equals(userCheck.getPassword())&& user.getUsername().equals(userCheck.getUsername())){
                return true;
            }
        }
        return false;
    }
}
