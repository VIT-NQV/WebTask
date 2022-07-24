package com.example.amelaproject.service;

import com.example.amelaproject.entity.UserEntity;

public interface UserService {

    UserEntity saveSignUp(UserEntity user);

    Boolean check(UserEntity user);
}
