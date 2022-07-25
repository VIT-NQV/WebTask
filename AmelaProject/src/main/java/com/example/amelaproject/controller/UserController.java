package com.example.amelaproject.controller;

import com.example.amelaproject.entity.UserEntity;
import com.example.amelaproject.service.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserImpl userimpl;

    @GetMapping("/signup")
    public String showSignUp() {
        return "signUp";
    }

    @PostMapping("/save_signup")
    public String addUsers(@ModelAttribute UserEntity user) {
        userimpl.AddUser(user);
        return "login";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String check(@ModelAttribute UserEntity user) {
        if (userimpl.check(user) == true) {
            return "taskListIndex";
        }
        return "login";
    }

}
