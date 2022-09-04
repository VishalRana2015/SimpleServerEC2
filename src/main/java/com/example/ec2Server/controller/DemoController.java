package com.example.ec2Server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/index")
    public ResponseEntity<String> index(){
        return new ResponseEntity<>("Website is Working...", HttpStatus.OK);
    }
}
