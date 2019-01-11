package com.tc.mapper;

import com.tc.entity.UserLogin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserLoginMapper {
    List<UserLogin> searchAll();
}
