package com.coderyu.springboottest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HomeController {

    private Logger logger=LoggerFactory.getLogger(HomeController.class);


    @RequestMapping(value = "/",method = GET)
    public String home(){
        return "Hello Spring Boot2d";
    }
}
