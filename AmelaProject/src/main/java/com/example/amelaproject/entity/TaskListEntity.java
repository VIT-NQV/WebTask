package com.example.amelaproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "QuestionDemo")
public class TaskListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listID;

    @Column(name = "title")
    private String title;

    @Column(name = "status")
    private String status;

    @Column(name = "describe")
    private String describe;

}

