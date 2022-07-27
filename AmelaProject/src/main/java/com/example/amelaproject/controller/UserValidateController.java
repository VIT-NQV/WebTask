package com.example.amelaproject.controller;

import com.example.amelaproject.entity.UserEntity;
import com.example.amelaproject.entity.UserValidateEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserValidateController {

    @GetMapping("/validate")
    public String showValidate (Model model) {
        model.addAttribute("userValidate", new UserValidateEntity());
        return "userValidate";
    }

    @PostMapping("/save")
    public String addUser(@Valid @ModelAttribute("userValidate") UserValidateEntity user, BindingResult result) {
        if (result.hasErrors()) {
            return "userValidate";
        }
        return "successful";
    }
}
