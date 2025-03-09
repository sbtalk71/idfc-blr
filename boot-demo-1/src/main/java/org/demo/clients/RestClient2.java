package org.demo.clients;

import com.demo.spring.entities.Emp;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class RestClient2 {
    public static void main(String[] args) {

        RestTemplate restTemplate= new RestTemplate();


        HttpHeaders headers= new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_XML_VALUE);

        HttpEntity<Void> requestData= new HttpEntity<>(headers);

        ResponseEntity<String> resp=restTemplate.exchange("http://localhost:8080/emp/104", HttpMethod.GET,requestData,String.class);

        System.out.println(resp.getBody());

        //POST Request
        Emp emp = new Emp(200,"Shantanu","Hyderabad",3000);

        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<Emp> empRequestData=new HttpEntity<>(emp,headers);

       ResponseEntity<Emp> empPostResponse= restTemplate.exchange("http://localhost:8080/emp/",HttpMethod.POST,empRequestData,Emp.class);

        System.out.println(empRequestData.getBody().getName());


    }
}
