package com.example.auth.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthConroller {

    @GetMapping("/proc")
    public String auth () {
        return "Auth !!!!!";
    }

    @GetMapping("/config")
    public String string(@Value("${message.owner}") String messageOwner,
                         @Value("${message.content}") String messageContent) {
        return "Configuration File's Message Owner: " + messageOwner + "\n"
                + "Configuration File's Message Content: " + messageContent;
    }
}
