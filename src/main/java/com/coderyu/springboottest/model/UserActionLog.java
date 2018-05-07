package com.coderyu.springboottest.model;

import java.util.Date;

public class UserActionLog {
    public Integer Id;
    public String LogTitle;
    public Date CreateTime;
    public Integer ActionUserId;
    public Integer RelationId;
    public String OldContent;
    public String NewContent;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLogTitle() {
        return LogTitle;
    }

    public void setLogTitle(String logTitle) {
        LogTitle = logTitle;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public Integer getActionUserId() {
        return ActionUserId;
    }

    public void setActionUserId(Integer actionUserId) {
        ActionUserId = actionUserId;
    }

    public Integer getRelationId() {
        return RelationId;
    }

    public void setRelationId(Integer relationId) {
        RelationId = relationId;
    }

    public String getOldContent() {
        return OldContent;
    }

    public void setOldContent(String oldContent) {
        OldContent = oldContent;
    }

    public String getNewContent() {
        return NewContent;
    }

    public void setNewContent(String newContent) {
        NewContent = newContent;
    }
}
