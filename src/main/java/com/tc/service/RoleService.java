package com.tc.service;

import com.tc.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getRolesByResourceId(String resourceId);
}
