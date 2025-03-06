package com.demo.spring;

import com.demo.spring.entities.Emp;
import com.demo.spring.repo.EmpRepository;
import com.demo.spring.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

@Autowired
private EmpService empService;

    //GET: http://localhost:8080/emp/greet
    @GetMapping(path = "/greet",produces = MediaType.TEXT_PLAIN_VALUE)
    public String greet(){
        return "Hello from Spring REST";
    }

    @GetMapping(path="/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Emp>> getAll(){
        return ResponseEntity.ok(empService.getAllEmps());
    }

    @GetMapping(path="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Emp> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(empService.findOneById(id));
    }
}
