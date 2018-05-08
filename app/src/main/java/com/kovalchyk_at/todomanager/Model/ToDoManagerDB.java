package com.kovalchyk_at.todomanager.Model;

import java.util.List;

public class ToDoManagerDB {
    private List<Company> company;
    private List<User> user;

    public ToDoManagerDB(List<Company> company, List<User> user) {
        this.company = company;
        this.user = user;
    }

    public ToDoManagerDB() {
    }

    public List<Company> getCompany() {
        return company;
    }

    public void setCompany(List<Company> company) {
        this.company = company;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
