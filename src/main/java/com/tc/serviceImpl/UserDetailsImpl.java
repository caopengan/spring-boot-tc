package com.tc.serviceImpl;

import com.tc.entity.SecurityGroup;
import com.tc.entity.UserLogin;
import com.tc.entity.UserLoginSecurityGroup;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails{
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for(UserLoginSecurityGroup sg :userLoginSecurityGroup){
            authorities.add(new SimpleGrantedAuthority(sg.getGroupId()));
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
    List<UserLoginSecurityGroup> userLoginSecurityGroup;

    public UserDetailsImpl() {
    }

    public UserDetailsImpl(UserLogin userLogin) {
        this.userName = userLogin.getUserLoginId();
        this.passWord = userLogin.getCurrentPassword();
    }

    public UserDetailsImpl(UserLogin userLogin,List<UserLoginSecurityGroup> userLoginSecurityGroup) {
        this.userName = userLogin.getUserLoginId();
        this.passWord = userLogin.getCurrentPassword();
        this.userLoginSecurityGroup = userLoginSecurityGroup;
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

    public List<UserLoginSecurityGroup> getUserLoginSecurityGroup() {
        return userLoginSecurityGroup;
    }

    public void setUserLoginSecurityGroup(List<UserLoginSecurityGroup> userLoginSecurityGroup) {
        this.userLoginSecurityGroup = userLoginSecurityGroup;
    }
}
