package com.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping(value = "/hello")
    public String getUsers() {
        return ("Hello");
    }
    @GetMapping(value = "/user")
    public String get() {
        return ("User");
    }
}
