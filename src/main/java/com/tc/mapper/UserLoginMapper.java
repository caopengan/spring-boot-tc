package com.tc.mapper;

import com.tc.entity.UserLogin;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserLoginMapper {

//    @Select("SELECT * FROM user_login")
//    @Results({
//            @Result(property = "userLoginId",  column = "user_login_id")
//    })
    List<UserLogin> searchAll();

    UserLogin searchUserById(String userName);
}
