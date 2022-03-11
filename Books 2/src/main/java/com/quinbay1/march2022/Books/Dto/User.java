package com.quinbay1.march2022.Books.Dto;


import java.io.Serializable;

public class User implements Serializable {
    private Long userid;
    private String name;
    private String address;
    private String PhNumber;

    public Long getId() {
        return userid;
    }

    public void setId(Long id) {
        this.userid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhNumber() {
        return PhNumber;
    }

    public void setPhNumber(String phNumber) {
        PhNumber = phNumber;
    }

    public User(Long userid, String name, String address, String phNumber) {
        this.userid = userid;
        this.name = name;
        this.address = address;
        PhNumber = phNumber;
    }

    public User() {
    }
}
