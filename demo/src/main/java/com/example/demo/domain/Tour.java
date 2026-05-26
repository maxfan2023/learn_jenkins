package com.example.demo.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Columns;

import javax.print.DocFlavor;

@Entity
@Table
public class Tour {

    public Tour(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    @Column(name = "title",columnDefinition = "nvarchar")
    private String title;
    @Column(name = "description",columnDefinition = "nvarchar")
    private String description;
    @Column(name = "blurb",columnDefinition = "nvarchar")
    private String blurb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }
}
