package com.example.amelaproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "login")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loginID;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
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
