package com.feignEmpl.entity;

public class FeignEntity {
    private int id;
    private String name;
    private int Salary;

    public FeignEntity() {
    }

    public FeignEntity(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
