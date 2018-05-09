package com.coderyu.springboottest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GenericErrorController implements ErrorController {

    private static final Logger logger = LoggerFactory.getLogger("GenericErrorController");
    private static final String ERROR_PATH = "/error";

    @RequestMapping(ERROR_PATH)
    @ResponseBody
    public String error(){

        return "errorPage.html";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
