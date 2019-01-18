package com.tc.entity;

import java.sql.Timestamp;

public class SecurityGroupPermission {
    private String groupId;
    private String permissionId;
    private Timestamp fromDate;
    private Timestamp thruDate;

    public SecurityGroupPermission() {
    }

    public SecurityGroupPermission(String groupId, String permissionId, Timestamp fromDate, Timestamp thruDate) {
        this.groupId = groupId;
        this.permissionId = permissionId;
        this.fromDate = fromDate;
        this.thruDate = thruDate;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
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
