package com.example.amelaproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "login")
public class SignUpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long loginID;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
}
