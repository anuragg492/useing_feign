package com.fincareproducts.products.entity;

public class ProductDTO {

    private String aadharNumber;
    private String panNumber;


    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public String getPanNumber(String panNumber) {
        return this.panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }
}
