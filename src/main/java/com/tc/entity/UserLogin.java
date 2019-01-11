package com.tc.entity;

import java.io.Serializable;

public class UserLogin implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userLoginId;
    private String currentPassword;
    private String enabled;
    private String partyId;
    private String telephoneNumber;
    private String openid;


    public UserLogin() {
    }

    public UserLogin(String userLoginId, String currentPassword, String enabled, String partyId, String telephoneNumber, String openid) {
        this.userLoginId = userLoginId;
        this.currentPassword = currentPassword;
        this.enabled = enabled;
        this.partyId = partyId;
        this.telephoneNumber = telephoneNumber;
        this.openid = openid;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
