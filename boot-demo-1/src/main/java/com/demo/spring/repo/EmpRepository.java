package com.demo.spring.repo;

import com.demo.spring.entities.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;


public interface EmpRepository extends JpaRepository<Emp, Integer> {

    @Modifying
    @Transactional
    @Query("update Emp e set e.salary=e.salary+:salary where e.empId=:id")
    public int updateSalary(Integer id, double salary);

}
