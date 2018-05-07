package com.coderyu.springboottest.model;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private String password;
    private Date createTime;
    private Boolean isActive;

    public User() {
    }

    public User(String name, String password, Date createTime, Boolean isActive) {
        this.name = name;
        this.password = password;
        this.createTime = createTime;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
