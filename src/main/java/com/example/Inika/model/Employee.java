package com.example.Inika.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Emp_Name")
    private String name;
    @Column(name = "Mobile")
    private BigInteger mobile;
    @Column(name = "Emp_Gender")
    private int gender;
    @Column(name = "DOB")
    private Date dob;
    @Column(name = "Nationality")
    private String nationality;

    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public BigInteger getMobile() {
        return mobile;
    }

    public void setMobile(BigInteger mobile) {
        this.mobile = mobile;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        gender = gender;
    }

    public Date getDOB() {
        return dob;
    }

    public void setDOB(Date DOB) {
        this.dob = DOB;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        nationality = nationality;
    }

}
