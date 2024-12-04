package com.buffer.product_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
@RestController
@RequestMapping("/product")
public class ProductController {

    @PostMapping
    public ResponseEntity<Long> addProduct() {;
        long valor =1;
        return new ResponseEntity<>(valor, HttpStatus.CREATED);
    }
}
