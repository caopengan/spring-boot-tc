package com.tc.mapper;

import com.tc.entity.User;

public interface UserMapper {

    User searchUserByUserName(String userName);
}
