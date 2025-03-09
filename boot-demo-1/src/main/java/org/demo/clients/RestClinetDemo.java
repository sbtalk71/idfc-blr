package org.demo.clients;

import com.demo.spring.entities.Emp;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

public class RestClinetDemo {
    public static void main(String[] args) {

        RestClient client=RestClient.create();

        String resp= client.get()
                .uri("http://localhost:8080/emp/104")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(String.class);

        System.out.println(resp);

        Emp emp = new Emp(201,"Ramu","Hyderabad",3000);
        Emp empResp= client.post().
                uri("http://localhost:8080/emp/")
                .body(emp)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(Emp.class);

        System.out.println(empResp.getName());
    }
}
