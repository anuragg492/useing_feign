package com.fincareproducts.products.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PrdEntiry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String aadharNumber;
    private String panNumber;
    private String motherName;

    public PrdEntiry() {
    }

    public PrdEntiry(int id, String aadharNumber, String panNumber, String motherName) {
        this.id = id;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.motherName = motherName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
}
