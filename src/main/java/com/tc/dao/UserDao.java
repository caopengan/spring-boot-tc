package com.tc.dao;

import com.tc.entity.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    List<UserLogin> searchAll();
}
