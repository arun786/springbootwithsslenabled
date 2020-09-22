package com.arun.springbootwithsslenabled.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arun on 9/22/20
 */
@RestController
public class StudentController {

    @GetMapping("/v1/student")
    public ResponseEntity<String> helloStudent() {
        return ResponseEntity.ok("Hello Student");
    }
}
