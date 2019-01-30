package com.tc.serviceImpl;

import com.tc.entity.User;
import com.tc.entity.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails{

    //返回用户所有角色的封装，一个Role对应一个GrantedAuthority
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for(UserRole userRole :userRoles){
            authorities.add(new SimpleGrantedAuthority(userRole.getRoleId()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return passWord;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    //判断账号是否过期，默认没有过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //判断账号是否被锁定，默认没有锁定
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //判断信用凭证是否过期，默认没有过期
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //判断账号是否可用，默认可用
    @Override
    public boolean isEnabled() {
        return false;
    }


    private String userName;
    private String passWord;
    //包含着用户对应的所有Role，在使用时调用者给对象注入roles
    List<UserRole> userRoles;

    public UserDetailsImpl() {
    }

    public UserDetailsImpl(User user) {
        this.userName = user.getUserName();
        this.passWord = user.getPassword();
    }

    public UserDetailsImpl(User user,List<UserRole> userRoles) {
        this.userName = user.getUserName();
        this.passWord = user.getPassword();
        this.userRoles = userRoles;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
