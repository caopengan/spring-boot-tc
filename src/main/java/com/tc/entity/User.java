package com.tc.entity;


import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable{

    private static final long serialVersionUID = -7099136147259578125L;

    private String id;
    private String userName;
    private String password;
    private String telephone;
    private String email;
    private Timestamp registerDate;

    public User() {
    }

    public User(String id, String userName, String password, String telephone, String email, Timestamp registerDate) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.telephone = telephone;
        this.email = email;
        this.registerDate = registerDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }
}
