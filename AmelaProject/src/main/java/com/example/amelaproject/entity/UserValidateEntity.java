package com.example.amelaproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Setter
@Getter
public class UserValidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "name not empty")
    private String name;

    @NotBlank(message = "name not empty")
    private String address;

    @NotBlank(message = "name not empty")
    private String phone;


}
