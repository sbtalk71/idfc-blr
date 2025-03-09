package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/hr")
public class HrController {
    private RestClient.Builder restClientBuilder;

    public HrController(RestClient.Builder restClientBuilder) {
        this.restClientBuilder = restClientBuilder;
    }

    @GetMapping(path="/emp/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getEmpDetails(@PathVariable Integer id){
              String response= restClientBuilder.build()
                        .get()
                        .uri("http://localhost:8080/emp/"+id)
                        .accept(MediaType.APPLICATION_JSON)
                        .retrieve()
                        .body(String.class);
              return ResponseEntity.ok(response);

    }
}
