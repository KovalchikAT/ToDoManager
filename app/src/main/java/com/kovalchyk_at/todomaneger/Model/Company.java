package com.kovalchyk_at.todomaneger.Model;

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
}
