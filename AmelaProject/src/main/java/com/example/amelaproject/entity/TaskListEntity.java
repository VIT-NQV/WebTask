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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listID;

    @Column(name = "title")
    private String title;

    @Column(name = "status")
    private String status;

    @Column(name = "describe")
    private String describe;

    public TaskListEntity() {

    }

    public TaskListEntity(Long listID, String title, String status, String describe) {
        this.listID = listID;
        this.title = title;
        this.status = status;
        this.describe = describe;
    }

    public Long getId() {
        return this.listID;
    }

    public void setId(Long listID) {
        this.listID = listID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescribe() {
        return this.describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}

