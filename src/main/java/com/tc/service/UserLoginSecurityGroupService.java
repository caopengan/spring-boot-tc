package com.tc.service;

import com.tc.entity.UserLoginSecurityGroup;

import java.util.List;

public interface UserLoginSecurityGroupService {

    List<UserLoginSecurityGroup> selectSecurityGroupsByUserId(String userName);
}
