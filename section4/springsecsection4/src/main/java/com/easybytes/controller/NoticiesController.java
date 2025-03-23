package com.easybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticiesController {

    @GetMapping("/notices")
    public String getNoticies(){
        return"Here are the notices from the DB";
    }
}
