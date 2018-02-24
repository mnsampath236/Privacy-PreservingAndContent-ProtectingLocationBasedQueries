package com.lbq.model;

public class User {
    String firstName;
    String lastName;
    String emilId;
    String mobile;
    String userId;
    String password;

    public User() {
    }

    public User(String firstName, String lastName, String emilId, String mobile, String userId, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emilId = emilId;
        this.mobile = mobile;
        this.userId = userId;
        this.password = password;
    }

    public String getEmilId() {
        return emilId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public void setEmilId(String emilId) {
        this.emilId = emilId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", emilId=" + emilId + ", mobile=" + mobile + ", userId=" + userId + ", password=" + password + '}';
    }
    
}