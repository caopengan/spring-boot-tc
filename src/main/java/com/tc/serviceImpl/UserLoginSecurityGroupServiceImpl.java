package com.tc.serviceImpl;

import com.tc.entity.UserLoginSecurityGroup;
import com.tc.mapper.UserLoginSecurityGroupMapper;
import com.tc.service.UserLoginSecurityGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userLoginSecurityGroupService")
public class UserLoginSecurityGroupServiceImpl implements UserLoginSecurityGroupService {

    @Resource
    private UserLoginSecurityGroupMapper userLoginSecurityGroupMapper;

    @Override
    public List<UserLoginSecurityGroup> selectSecurityGroupsByUserId(String userName) {
        return userLoginSecurityGroupMapper.selectSecurityGroupsByUserId(userName);
    }
}
