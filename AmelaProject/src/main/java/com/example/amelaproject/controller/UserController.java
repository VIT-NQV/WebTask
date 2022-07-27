package com.example.amelaproject.controller;

import com.example.amelaproject.entity.UserEntity;
import com.example.amelaproject.service.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.bind.SchemaOutputResolver;

@Controller
public class UserController {

    @Autowired
    private UserImpl userimpl;

    @GetMapping("/signup")
    public String showSignUp(Model model ) {
        model.addAttribute("user", new UserEntity());
        return "signUp";
    }

    @PostMapping("/save_signup")
    public String addUsers(@Valid @ModelAttribute("user") UserEntity user,BindingResult result) {
        if (result.hasErrors()) {
            return "signup";
        }
        userimpl.AddUser(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String check(@ModelAttribute UserEntity user) {
        if (userimpl.check(user) == true) {
            return "redirect:/tasklist/page";
        }
        return "redirect:/login";
    }

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        System.out.println("A binder for object: " + binder.getObjectName());
//    }

}
