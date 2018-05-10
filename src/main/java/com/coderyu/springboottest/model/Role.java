package com.coderyu.springboottest.model;

public class Role {
    private Integer Id;
    private String name;

    public Role() {
    }

    public Role(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
