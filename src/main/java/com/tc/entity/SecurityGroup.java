package com.tc.entity;

import java.io.Serializable;

public class SecurityGroup implements Serializable{
    private static final long serialVersionUID = 1L;
    private String groupId;
    private String groupName;
    private String description;

    public SecurityGroup() {
    }

    public SecurityGroup(String groupId, String groupName, String description) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.description = description;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
