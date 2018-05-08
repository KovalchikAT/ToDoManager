package com.kovalchyk_at.todomanager.Model;

import java.util.List;

/**
 * Created by Kovalchyk_AT on 22.03.2018.
 */

public class User {
    private String userId;
    private String userName;
    private String userSurname;
    private String userEmail;
    private Address userAddress;
    private String userPhone;
    private String userWebsite;
    private Integer userPositionId;
    private List<Integer> userTaskId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserWebsite() {
        return userWebsite;
    }

    public void setUserWebsite(String userWebsite) {
        this.userWebsite = userWebsite;
    }

    public Integer getUserPositionId() {
        return userPositionId;
    }

    public void setUserPositionId(Integer userPositionId) {
        this.userPositionId = userPositionId;
    }

    public List<Integer> getUserTaskId() {
        return userTaskId;
    }

    public void setUserTaskId(List<Integer> userTaskId) {
        this.userTaskId = userTaskId;
    }
}
