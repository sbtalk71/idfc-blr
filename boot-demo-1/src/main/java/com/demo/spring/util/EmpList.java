package com.demo.spring.util;

import com.demo.spring.entities.Emp;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement
public class EmpList {


    private List<Emp> empList;

    @XmlElement(name = "emp")
    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
