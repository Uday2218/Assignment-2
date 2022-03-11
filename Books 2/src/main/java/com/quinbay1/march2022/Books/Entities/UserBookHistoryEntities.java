package com.quinbay1.march2022.Books.Entities;

import io.swagger.models.auth.In;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name="UserbookHistoryentities")
public class UserBookHistoryEntities {

    @Id
    //final int number = 1;
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;
    @Column (name="userid",nullable = false)
    private Long userid;
    @NotBlank(message="Student Name cannot be empty")


    private String startdate;


    private String Enddate;

    public UserBookHistoryEntities() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return Enddate;
    }

    public void setEnddate(String enddate) {
        Enddate = enddate;
    }

    public UserBookHistoryEntities(Long id, Long userid, @NotBlank(message = "Student Name cannot be empty") String startdate, String enddate) {
        this.id = id;
        this.userid = userid;
        this.startdate = startdate;
        Enddate = enddate;
    }
}

