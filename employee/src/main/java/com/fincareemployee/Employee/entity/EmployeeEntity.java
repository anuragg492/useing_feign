package com.fincareemployee.Employee.entity;


import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "emp")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

    @Size(min = 2,message = "min. 2 characters are required")
    @Size(max = 10,message = "max. 10 characters are required")
  private String name;

    @Range(min = 1000,message ="min. value be should  1000")
    @Range(max = 10000,message = "max. value should be 10000")
  private int salary;


    public EmployeeEntity() {
    }

    public EmployeeEntity(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
