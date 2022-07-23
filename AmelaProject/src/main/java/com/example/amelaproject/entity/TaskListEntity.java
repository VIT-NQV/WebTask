package com.example.amelaproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "listtask")
public class TaskListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long listID;

    @Column(name = "title")
    private String title;

    @Column(name = "status")
    private String status;

    @Column(name = "describe")
    private String describe;

}
