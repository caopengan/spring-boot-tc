package com.tc.controller;

import com.tc.entity.SecurityGroup;
import com.tc.entity.UserLogin;
import com.tc.service.SecurityGroupService;
import com.tc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private SecurityGroupService securityGroupService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UserLogin> getAllUser(){

        return userService.searchAllUsers();
    }


    @RequestMapping("/getAllSecurityGroup")
    @ResponseBody
    public List<SecurityGroup> getAllSecurityGroup(){

        return securityGroupService.getAllSecurityGroup();
    }

}
