package com.example.amelaproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Setter
@Getter
@Table(name = "login")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(0)
    private Long loginID;

    @Column(name = "name")
    @NotBlank(message = "Name not null")
    private String name;

    @Column(name = "username")
    @NotBlank(message = "Username not null")
    private String username;

    @Column(name = "password")
    @NotBlank(message = "Password not null")
    private String password;

    public UserEntity() {

    }

    public UserEntity(Long loginID, String name, String username, String password) {
        this.loginID = loginID;
        this.name = name;
        this.username = username;
        this.password = password;
    }
}
