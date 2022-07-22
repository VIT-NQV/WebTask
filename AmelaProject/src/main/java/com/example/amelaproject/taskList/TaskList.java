package com.example.amelaproject.taskList;

import javax.persistence.*;

@Entity
@Table(name = "taskList")
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer listID;

    @Column
    private String title;

    @Column
    private String status;

    @Column
    private String describe;

    public Integer getListID() {
        return listID;
    }

    public void setListID(Integer listID) {
        this.listID = listID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus(String status) {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescribe(String describe) {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

}
