package com.liimadev.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public ResponseEntity<?> ola () {
        return new ResponseEntity<>(HttpStatus.OK).ok("Você está logado :>");
    }
}
