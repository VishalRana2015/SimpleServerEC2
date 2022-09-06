package com.example.ec2Server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private static int VALUE = 4;
    private int v=0;
    @GetMapping("/index")
    public ResponseEntity<String> index(){
        String response;
        if ( v < VALUE){
            response = "v is lesser than 4 with value " + v;
            v ++;
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        else{
            response = " v having value of " + v + " which is not lesser than 4";
            return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
        }


    }

    @GetMapping("/health")
    public ResponseEntity<String> health(){
        return new ResponseEntity<>("Website is health", HttpStatus.OK);
    }
}
