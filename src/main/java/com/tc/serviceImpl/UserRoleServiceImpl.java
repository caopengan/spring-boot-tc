package com.tc.serviceImpl;

import com.tc.entity.UserRole;
import com.tc.mapper.UserRoleMapper;
import com.tc.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;


    @Override
    public List<UserRole> getRolesByUserId(String userId) {
        return userRoleMapper.getRolesByUserId(userId);
    }
}
