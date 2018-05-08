package com.kovalchyk_at.todomanager.Model;

import java.util.List;

/**
 * Created by Kovalchyk_AT on 22.03.2018.
 */

public class Company {
    private String companyId;
    private Address companyAddress;
    private String companyName;
    private String companyPhone;
    private String companyEmail;
    private String companyWebsite;
    private List<Position> companyPositionsList;
    private List<Task> companyTaskList;
    private List<User> companyUserList;

    public Company() {
    }

    public Company(String companyId,
                   String companyName,
                   String companyPhone,
                   String companyEmail,
                   String companyWebsite,
                   String country,
                   String region,
                   String city,
                   String street,
                   String suite,
                   String zipcode,
                   double lat, double lon) {
        this.companyId = companyId;
        this.companyAddress = new Address(country,region,city,street,suite,zipcode,lat,lon);
        this.companyName = companyName;
        this.companyPhone = companyPhone;
        this.companyEmail = companyEmail;
        this.companyWebsite = companyWebsite;
        this.companyPositionsList = companyPositionsList;
    }

    public String getCompanyId() {
        if (companyId!=null){return companyId;}else{return "empty";}
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        if (companyName!=null){return companyName;}else{return "empty";}
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyPhone() {
        if (companyPhone!=null){return companyPhone;}else{return "empty";}
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyEmail() {
        if (companyEmail!=null){return companyEmail;}else{return "empty";}
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyWebsite() {
        if (companyWebsite!=null){return companyWebsite;}else{return "empty";}
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public List<Position> getCompanyPositionsList() {
        return companyPositionsList;
    }

    public void setCompanyPositionsList(List<Position> companyPositionsList) {
        this.companyPositionsList = companyPositionsList;
    }

    public List<Task> getCompanyTaskList() {
        return companyTaskList;
    }

    public void setCompanyTaskList(List<Task> companyTaskList) {
        this.companyTaskList = companyTaskList;
    }

    public List<User> getCompanyUserList() {
        return companyUserList;
    }

    public void setCompanyUserList(List<User> companyUserList) {
        this.companyUserList = companyUserList;
    }
}

