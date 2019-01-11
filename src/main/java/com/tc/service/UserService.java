package com.tc.service;

import com.tc.entity.UserLogin;

import java.util.List;

public interface UserService {

    List<UserLogin> searchAllUsers();
}
