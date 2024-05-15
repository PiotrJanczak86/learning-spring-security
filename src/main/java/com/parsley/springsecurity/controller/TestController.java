package com.parsley.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/unrestricted")
    public String unrestricted(){
        return "This is an unrestricted page";
    }

    @GetMapping("/restricted")
    public String restricted(){
        return "This is a restricted page";
    }
}
