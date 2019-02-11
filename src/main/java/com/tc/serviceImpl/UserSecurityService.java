package com.tc.serviceImpl;

import com.tc.entity.User;
import com.tc.service.UserRoleService;
import com.tc.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userSecurityService")
public class UserSecurityService implements UserDetailsService{

    @Resource
    private UserService userService;

    @Resource
    private UserRoleService userRoleService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.searchUserByUserName(s);
        if(user == null){
            throw new UsernameNotFoundException("没有该用户："+s);
        }

        //查到User后将其封装为UserDetails的实现类的实例供程序调用
        //用该User和它对应的Role实体们构造UserDetails的实现类
        return new UserDetailsImpl(user,userRoleService.getRolesByUserId(user.getId()));
    }
}
