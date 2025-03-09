package com.demo.spring.service;

import com.demo.spring.entities.Emp;
import com.demo.spring.exceptions.EmpExistsException;
import com.demo.spring.exceptions.EmpNotFoundException;
import com.demo.spring.repo.EmpRepository;
import com.demo.spring.util.EmpList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    private Logger logger= LoggerFactory.getLogger(this.getClass().getName());
    private EmpRepository empRepository;

    public EmpService(EmpRepository empRepository){
        this.empRepository=empRepository;
    }

    public EmpList getAllEmps(){
        logger.info("Fetchin all the employees from database");
        EmpList list= new EmpList();
        list.setEmpList(empRepository.findAll());
        return list;
    }

    public Emp findOneById(Integer id){
        /*Optional<Emp> empOp=empRepository.findById(id);
        if(empOp.isPresent()){
            return empOp.get();
        }else{
            throw new RuntimeException("Emp Not Found with id "+id);
        }*/

        logger.info("Fetchin on employee with id "+id);
        return empRepository.findById(id).orElseThrow(()->new EmpNotFoundException("emp not found"));
    }

    public Emp save(Emp e) {
        if (empRepository.existsById(e.getEmpId())) {
            throw new EmpExistsException("Emp with id " + e.getEmpId() + " Exists");
        } else {
            return empRepository.save(e);
        }
    }

    public Emp update(Emp e) {
        if (empRepository.existsById(e.getEmpId())) {
           return empRepository.save(e);
        } else {
            throw new EmpNotFoundException("Emp with id " + e.getEmpId() + " Not Found");
        }
    }

    public boolean delete(Integer id){
        if(empRepository.existsById(id)){
            empRepository.deleteById(id);
            return true;
        }else{
            throw new EmpNotFoundException("Emp not found with id "+id);
        }
    }


    public int updateSalary(Integer id, double salary){
    return empRepository.updateSalary(id,salary);
    }

}
