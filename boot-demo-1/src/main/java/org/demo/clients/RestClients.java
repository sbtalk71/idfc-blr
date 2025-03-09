package org.demo.clients;

import com.demo.spring.entities.Emp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClients {
    public static void main(String[] args) {

        RestTemplate restTemplate= new RestTemplate();

        String resp=restTemplate.getForObject("http://localhost:8080/emp/104",String.class);
        System.out.println(resp);

        Emp resp1=restTemplate.getForObject("http://localhost:8080/emp/104",Emp.class);
        System.out.println(resp1.getName());

        ResponseEntity<Emp> empResponseEntity=restTemplate.getForEntity("http://localhost:8080/emp/104",Emp.class);

        Emp emp=empResponseEntity.getBody();
        System.out.println(emp.getName());

    }
}
