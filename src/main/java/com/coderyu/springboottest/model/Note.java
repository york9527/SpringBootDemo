package com.coderyu.springboottest.model;

import java.util.Date;

public class Note {
    public Integer Id;
    public String Title;
    public String Content;
    public Date CreateTime;
    public Date UpdateTime;
    public Integer CreateUserId;
    public Integer UpdateUserId;

    public Note(Integer id, String title, String content, Date createTime, Date updateTime, Integer createUserId, Integer updateUserId) {
        Id = id;
        Title = title;
        Content = content;
        CreateTime = createTime;
        UpdateTime = updateTime;
        CreateUserId = createUserId;
        UpdateUserId = updateUserId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Date updateTime) {
        UpdateTime = updateTime;
    }

    public Integer getCreateUserId() {
        return CreateUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        CreateUserId = createUserId;
    }

    public Integer getUpdateUserId() {
        return UpdateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        UpdateUserId = updateUserId;
    }
}
