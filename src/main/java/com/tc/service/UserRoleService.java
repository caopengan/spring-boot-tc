package com.tc.service;

import com.tc.entity.UserRole;

import java.util.List;

public interface UserRoleService {

    List<UserRole> getRolesByUserId(String userId);
}
