package com.demo.spring;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import com.demo.spring.entities.Emp;
import com.demo.spring.service.EmpService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.*;

@AutoConfigureMockMvc
@SpringBootTest
public class EmpControllerTests {
    @Autowired
    MockMvc mvc;


    @MockitoBean
    EmpService service;

    @Test
    public void testFindOneEmp() throws Exception{
        when(service.findOneById(100)).thenReturn(new Emp(100,"A","B",200));

        mvc.perform(get("/emp/100"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name").value("A"));
    }
}
