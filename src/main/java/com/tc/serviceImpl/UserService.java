package com.tc.serviceImpl;

import com.tc.entity.UserLogin;
import com.tc.service.UserLoginSecurityGroupService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements UserDetailsService{

    @Resource
    private com.tc.service.UserService userService;

    @Resource
    private UserLoginSecurityGroupService userLoginSecurityGroupService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserLogin userLogin = userService.searchUserById(s);
        if(userLogin == null){
            throw new UsernameNotFoundException("没有该用户："+s);
        }

        //查到User后将其封装为UserDetails的实现类的实例供程序调用
        //用该User和它对应的Role实体们构造UserDetails的实现类
        return new UserDetailsImpl(userLogin,userLoginSecurityGroupService.selectSecurityGroupsByUserId(userLogin.getUserLoginId()));
    }
}
