package com.tc.serviceImpl;

import com.tc.dao.UserDao;
import com.tc.entity.UserLogin;
import com.tc.mapper.UserLoginMapper;
import com.tc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

//    @Resource
//    private UserDao userDao;
    @Resource
    private UserLoginMapper userLoginMapper;

    @Override
    public List<UserLogin> searchAllUsers() {
        return userLoginMapper.searchAll();
    }
}
