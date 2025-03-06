package com.demo.spring.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="EMPOLYEE")
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
}
