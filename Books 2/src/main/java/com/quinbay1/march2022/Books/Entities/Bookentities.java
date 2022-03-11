package com.quinbay1.march2022.Books.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="bookentities")
public class Bookentities {
    @Id
    //final int number = 1;
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;

    @NotBlank(message="Student Name cannot be empty")
    private String name;
    private String writer;
    private String summary;
    private String category;

    public Bookentities() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Bookentities(Long id, @NotBlank(message = "Student Name cannot be empty") String name, String writer, String summary, String category) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.summary = summary;
        this.category = category;
    }
}
