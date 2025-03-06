package com.demo.spring;

import com.demo.spring.entities.Emp;
import com.demo.spring.repo.EmpRepository;
import com.demo.spring.service.EmpService;
import com.demo.spring.util.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
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

    @PostMapping(path="/",produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Emp> addEmp(@RequestBody Emp e){
        return ResponseEntity.ok(empService.save(e));
    }

    @PutMapping(path="/",produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Emp> updateEmp(@RequestBody Emp e){
        return ResponseEntity.ok(empService.update(e));
    }

    @DeleteMapping(path="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseMessage> deleteEmp(@PathVariable("id") Integer id){
        boolean resp= empService.delete(id);
        if(resp){
            return ResponseEntity.ok(new ResponseMessage("deleted"));
        }else{
            return ResponseEntity.ok(new ResponseMessage("not deleted"));
        }
    }

    @PatchMapping(path="/{id}/{salary}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateSal(@PathVariable Integer id, @PathVariable double salary){
        return ResponseEntity.ok(empService.updateSalary(id,salary));
    }
}
