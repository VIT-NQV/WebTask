package com.example.amelaproject.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Setter
@Getter
@Table(name = "login")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long loginID;

    @Column(name = "name")
    @NotEmpty(message = "You need to enter your name")
    private String name;

    @Column(name = "username")
    @NotEmpty(message = "You need to enter username")
    private String username;

    @Column(name = "password")
    @NotEmpty(message = "You need to enter password")
    private String password;

}
