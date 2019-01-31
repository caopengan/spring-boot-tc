package com.tc.serviceImpl;

import com.tc.entity.Role;
import com.tc.mapper.RoleMapper;
import com.tc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRolesByResourceId(String resourceId) {
        return roleMapper.getRolesByResourceId(resourceId);
    }
}
