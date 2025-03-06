package com.demo.spring.service;

import com.demo.spring.entities.Emp;
import com.demo.spring.repo.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    private EmpRepository empRepository;

    public EmpService(EmpRepository empRepository){
        this.empRepository=empRepository;
    }

    public List<Emp> getAllEmps(){
        return empRepository.findAll();
    }

    public Emp findOneById(Integer id){
        /*Optional<Emp> empOp=empRepository.findById(id);
        if(empOp.isPresent()){
            return empOp.get();
        }else{
            throw new RuntimeException("Emp Not Found with id "+id);
        }*/

        return empRepository.findById(id).orElseThrow(()->new RuntimeException("emp not found"));
    }
}
