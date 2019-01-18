package com.tc.entity;

public class SecurityPermission {
    private String permissionId;
    private String description;

    public SecurityPermission() {
    }

    public SecurityPermission(String permissionId, String description) {
        this.permissionId = permissionId;
        this.description = description;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
