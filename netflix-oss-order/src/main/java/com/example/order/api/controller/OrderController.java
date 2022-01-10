package com.example.order.api.controller;

import com.example.order.api.dto.OrderDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @GetMapping("/hystrix}")
    public String info() {
        return "SUCCESS !!!!";
    }

    @PostMapping("/")
    public String add(@RequestBody OrderDto.Post request) {
        
        return "success";
    }
}
