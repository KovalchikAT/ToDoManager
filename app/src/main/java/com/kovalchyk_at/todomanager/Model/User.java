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
    private String userPositionId;
    private String userCompanyId;
    private String userCompany;
    private String userPosition;
    private List<Integer> userTaskId;

    public User() {
    }

    /**
    *@param userId,
     *@param userName,
     *@param userSurname,
     *@param userEmail,
     *@param userAddress,
     *@param userPhone,
     *@param userWebsite,
     *@param userPositionId,
     *@param userCompanyId,
     *@param userCompany,
     *@param userPosition
    */
    public User(String userId,
                String userName,
                String userSurname,
                String userEmail,
                Address userAddress,
                String userPhone,
                String userWebsite,
                String userPositionId,
                String userCompanyId,
                String userCompany,
                String userPosition) {
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userWebsite = userWebsite;
        this.userPositionId = userPositionId;
        this.userCompanyId = userCompanyId;
        this.userCompany = userCompany;
        this.userPosition = userPosition;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserCompanyId() {
        return userCompanyId;
    }

    public void setUserCompanyId(String userCompanyId) {
        this.userCompanyId = userCompanyId;
    }

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

    public String getUserPositionId() {
        return userPositionId;
    }

    public void setUserPositionId(String userPositionId) {
        this.userPositionId = userPositionId;
    }

    public List<Integer> getUserTaskId() {
        return userTaskId;
    }

    public void setUserTaskId(List<Integer> userTaskId) {
        this.userTaskId = userTaskId;
    }
}
