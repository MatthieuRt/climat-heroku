package com.example.climatheroku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class AdminController {
    @RequestMapping("/")
    public String index(HttpServletRequest request){
        return "index";
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        return "ok";
    }
}
