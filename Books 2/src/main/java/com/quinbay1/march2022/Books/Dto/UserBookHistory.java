package com.quinbay1.march2022.Books.Dto;

import java.io.Serializable;
import java.util.Date;

public class UserBookHistory implements Serializable {
   private Long userid;
   private Long id;
   private String startdate;
   private String Enddate;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UserBookHistory(Long userid, Long id, String startdate, String enddate) {
        this.userid = userid;
        this.id = id;
        this.startdate = startdate;
        Enddate = enddate;
    }

    public UserBookHistory() {
    }
}

