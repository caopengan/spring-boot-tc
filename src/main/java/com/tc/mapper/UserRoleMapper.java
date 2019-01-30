package com.tc.mapper;

import com.tc.entity.UserRole;

import java.util.List;

public interface UserRoleMapper {

    List<UserRole> getRolesByUserId(String userId);
}
