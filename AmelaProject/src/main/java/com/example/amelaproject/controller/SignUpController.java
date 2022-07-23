package com.example.amelaproject.controller;

import com.example.amelaproject.entity.SignUpEntity;
import com.example.amelaproject.service.impl.SignUpImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private SignUpImpl signupimpl;

    @GetMapping("/signup")
    public String showSignUp() {
        return "signUp";
    }

    @PostMapping("/save_signup")
    public String saveSignUp(@ModelAttribute SignUpEntity signup) {
        signupimpl.saveSignUp(signup);
        System.out.println("Welcome");
        return "login";
    }

}
