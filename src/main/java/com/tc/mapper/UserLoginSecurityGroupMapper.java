package com.tc.mapper;

import com.tc.entity.UserLoginSecurityGroup;

import java.util.List;

public interface UserLoginSecurityGroupMapper {

    List<UserLoginSecurityGroup> selectSecurityGroupsByUserId(String userName);
}
