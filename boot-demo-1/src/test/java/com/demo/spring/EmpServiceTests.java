package com.demo.spring;

import com.demo.spring.entities.Emp;
import com.demo.spring.exceptions.EmpNotFoundException;
import com.demo.spring.repo.EmpRepository;
import com.demo.spring.service.EmpService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.Optional;


@SpringBootTest
//@EnableAutoConfiguration(exclude = {JpaRepositoriesAutoConfiguration.class, DataSourceAutoConfiguration.class})
class EmpServiceTests {

    @Autowired
    EmpService service;

    @MockitoBean
    EmpRepository repository;

    @Test
public void shouldReturnNameAIfId100(){

when(repository.findById(100)).thenReturn(Optional.of(new Emp(100,"A","B",30)));

        Assertions.assertEquals("A",service.findOneById(100).getName());
}

    @Test
    public void shouldThrowEmpNotFoundExceptionIfIdNonExistent(){

        when(repository.findById(1010)).thenThrow(new EmpNotFoundException());

        Assertions.assertThrows(EmpNotFoundException.class,()->{
            service.findOneById(1010);
        });
    }

}

