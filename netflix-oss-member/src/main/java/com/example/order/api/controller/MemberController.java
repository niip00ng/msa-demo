package com.example.order.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {

    @GetMapping("/info")
    public String info(@Value("${server.port}") String port) {
        return "member : 이준환, " + port;
    }

    @GetMapping("/name")
    public String name(@Value("${server.port}") String port, @RequestParam String str) {
        return "member : 이준환, " + port + str;
    }

    @GetMapping("/config")
    public String string(@Value("${message.owner}") String messageOwner,
                         @Value("${message.content}") String messageContent) {
        return "Configuration File's Message Owner: " + messageOwner + "\n"
                + "Configuration File's Message Content: " + messageContent;
    }

    @GetMapping("/config/database")
    public String database(@Value("${spring.datasource.driver}") String driver,
                           @Value("${spring.datasource.url}") String url,
                           @Value("${spring.datasource.username}") String username,
                           @Value("${spring.datasource.password}") String password,
                           @Value("${jwt.token.key}") String tokenKey) {
        return "driver: " + driver + "\n"
                + "url: " + url + "\n"
                + "username: " + username + "\n"
                + "password: " + password + "\n\n"
                + "token key: " + tokenKey;
    }

}
