package com.tc.entity;

import java.io.Serializable;
import java.util.List;

public class Resource implements Serializable {
    private static final long serialVersionUID = 440860178136815280L;

    private String id;
    private String url;
    private String resourceName;

    private List<RoleResource> roleResources;

    public Resource() {
    }

    public Resource(String id, String url, String resourceName,List<RoleResource> roleResources) {
        this.id = id;
        this.url = url;
        this.resourceName = resourceName;
        this.roleResources = roleResources;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public List<RoleResource> getRoleResources() {
        return roleResources;
    }

    public void setRoleResources(List<RoleResource> roleResources) {
        this.roleResources = roleResources;
    }
}
