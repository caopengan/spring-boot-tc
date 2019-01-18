package com.tc.entity;

import java.sql.Timestamp;

public class UserLoginSecurityGroup {

    private String userLoginId;
    private String groupId;
    private Timestamp fromDate;
    private Timestamp thruDate;

    public UserLoginSecurityGroup() {
    }

    public UserLoginSecurityGroup(String userLoginId, String groupId, Timestamp fromDate, Timestamp thruDate) {
        this.userLoginId = userLoginId;
        this.groupId = groupId;
        this.fromDate = fromDate;
        this.thruDate = thruDate;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Timestamp getFromDate() {
        return fromDate;
    }

    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    public Timestamp getThruDate() {
        return thruDate;
    }

    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
}
