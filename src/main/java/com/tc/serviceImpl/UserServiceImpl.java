package com.tc.serviceImpl;

import com.tc.dao.UserDao;
import com.tc.entity.User;
import com.tc.entity.UserLogin;
import com.tc.mapper.UserLoginMapper;
import com.tc.mapper.UserMapper;
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

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserLogin> searchAllUsers() {
        return userLoginMapper.searchAll();
    }

    @Override
    public UserLogin searchUserById(String userName) {
        return userLoginMapper.searchUserById(userName);
    }

    @Override
    public User searchUserByUserName(String userName) {
        return userMapper.searchUserByUserName(userName);
    }
}
