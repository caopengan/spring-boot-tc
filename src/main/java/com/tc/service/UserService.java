package com.tc.service;

import com.tc.entity.User;
import com.tc.entity.UserLogin;

import java.util.List;

public interface UserService {

    List<UserLogin> searchAllUsers();

    UserLogin searchUserById(String userName);

    User searchUserByUserName(String userName);
}
