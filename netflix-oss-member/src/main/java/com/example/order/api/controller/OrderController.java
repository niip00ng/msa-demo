package com.example.order.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/order")
    public ResponseEntity<Object> list () {
        log.debug("!!!! order list !!!!");
        return null;
    }
}
