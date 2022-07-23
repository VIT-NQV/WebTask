package com.example.amelaproject.service.impl;

import com.example.amelaproject.entity.SignUpEntity;
import com.example.amelaproject.repository.SignUpRepository;
import com.example.amelaproject.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpImpl implements SignUpService {

    @Autowired
    private SignUpRepository signuprepo;

    @Override
    public SignUpEntity saveSignUp(SignUpEntity signup){
        return signuprepo.save(signup);
    }
}
