package com.naythan.ecom_proj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Welcome {

    @GetMapping
    public String welcome(){
        return "Welocme to ecom app";
    }
}
