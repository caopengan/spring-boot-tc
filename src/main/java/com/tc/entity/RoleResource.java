package com.tc.entity;

public class RoleResource {
    private String id;
    private String roleId;
    private String resourceId;

    public RoleResource() {
    }

    public RoleResource(String id, String roleId, String resourceId) {
        this.id = id;
        this.roleId = roleId;
        this.resourceId = resourceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
