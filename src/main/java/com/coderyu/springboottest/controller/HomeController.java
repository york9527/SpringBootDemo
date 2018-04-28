package com.coderyu.springboottest.controller;

import com.coderyu.springboottest.AppConfig;
//import com.coderyu.springboottest.DataSourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HomeController {

    private Logger logger=LoggerFactory.getLogger(HomeController.class);

    //@Autowired
    //private DataSourceConfig dbConfig;

    @Autowired
    private AppConfig config;

    @RequestMapping(value = "/",method = GET)
    public String home(){
        logger.error(config.getUrl());
        return "Hello Spring Boot2";
    }
}
