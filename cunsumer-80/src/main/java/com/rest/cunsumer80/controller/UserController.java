package com.rest.cunsumer80.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    private String baseUrl="http://localhost:8001/";

    @GetMapping("getById")
    public String getUserById(@RequestParam Integer id){
        return restTemplate.getForObject(baseUrl+"getUserById?id="+id,String.class);
    }
}
