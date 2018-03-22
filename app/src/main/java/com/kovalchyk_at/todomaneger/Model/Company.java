package com.kovalchyk_at.todomaneger.Model;

import java.util.List;

/**
 * Created by Kovalchyk_AT on 22.03.2018.
 */

public class Company {
    private String name;
    private Adress adress;
    private String phone;
    private String email;
    private String website;
    private List<Position> positions;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Position> getPositions() {
        return positions;
    }
    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public Company(String name, Adress adress, String phone, String email, String website, List<Position> positions) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.positions = positions;
    }

}
