package com.satyanand.MicroserviceApp1.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/get-info")
    public ResponseEntity<String> getSomeInfo(){
        String info = "Hi All, Hope You are doing well.";
        return new ResponseEntity<String>(info, HttpStatus.OK);
    }
}
