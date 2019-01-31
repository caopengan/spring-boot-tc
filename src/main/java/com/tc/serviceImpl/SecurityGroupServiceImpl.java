package com.tc.serviceImpl;

import com.tc.entity.SecurityGroup;
import com.tc.mapper.SecurityGroupMapper;
import com.tc.service.SecurityGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("securityGroupService")
public class SecurityGroupServiceImpl implements SecurityGroupService{

    @Resource
    private SecurityGroupMapper securityGroupMapper;

    @Override
    public List<SecurityGroup> getAllSecurityGroup() {
        return securityGroupMapper.searchAllSecurityGroup();
    }
}
