package com.demo.spring.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

//@Data
@Entity
@Table(name="EMPOLYEE")
@XmlRootElement
public class Emp {
    @Id
    @Column(name="EMPNO")
    private Integer empId;

    @Column(name="NAME")
    private String name;

    @Column(name="ADDRESS")
    private String city;

    @Column(name="SALARY")
    private double salary;

    public Emp(){

    }
    public Emp(Integer empId, String name, String city, double salary) {
        this.empId = empId;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
