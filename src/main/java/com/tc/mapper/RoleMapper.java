package com.tc.mapper;

import com.tc.entity.Role;

import java.util.List;

public interface RoleMapper {

    List<Role> getRolesByResourceId(String resourceId);
}
