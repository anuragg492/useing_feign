package com.fincareemployee.Employee.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PrdtDTO {


    private long aadharNumber;
    private String panNumber;





    public long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }


}
