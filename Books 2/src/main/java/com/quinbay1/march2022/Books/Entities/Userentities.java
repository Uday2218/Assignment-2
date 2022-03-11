package com.quinbay1.march2022.Books.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="userentities")
public class Userentities {
    @Id
    //final int number = 1;
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="userid",nullable = false)
    private Long userid;

    private String name;
    private String address;
    private String PhNumber;

    public Userentities() {
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
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

    public Userentities(Long userid, @NotBlank(message = "Student Name cannot be empty") String name, String address, String phNumber) {
        this.userid = userid;
        this.name = name;
        this.address = address;
        PhNumber = phNumber;
    }
}
