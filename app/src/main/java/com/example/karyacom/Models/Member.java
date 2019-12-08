package com.example.karyacom.Models;

public class Member{
    private String Name;
    private int phone;
    private String location;
    private int famille;

    public Member() {
    }

    public Member(String name, int phone, String location, int famille) {
        Name = name;
        this.phone = phone;
        this.location = location;
        this.famille = famille;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFamille() {
        return famille;
    }

    public void setFamille(int famille) {
        this.famille = famille;
    }
}
