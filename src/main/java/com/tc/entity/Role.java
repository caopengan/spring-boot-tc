package com.tc.entity;

import java.io.Serializable;
import java.util.List;

public class Role  implements Serializable{
    private static final long serialVersionUID = 2360018516202610853L;

    private String id;
    private String role_name;
    private String role_name_zh;

    private List<RoleResource> roleResources;


    public Role() {
    }

    public Role(String id, String role_name, String role_name_zh,List<RoleResource> roleResources) {
        this.id = id;
        this.role_name = role_name;
        this.role_name_zh = role_name_zh;
        this.roleResources = roleResources;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_name_zh() {
        return role_name_zh;
    }

    public void setRole_name_zh(String role_name_zh) {
        this.role_name_zh = role_name_zh;
    }

    public List<RoleResource> getRoleResources() {
        return roleResources;
    }

    public void setRoleResources(List<RoleResource> roleResources) {
        this.roleResources = roleResources;
    }
}
