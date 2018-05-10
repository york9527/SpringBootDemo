package com.coderyu.springboottest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/note")
public class NoteController {
    private Logger logger = LoggerFactory.getLogger(NoteController.class);

    @PreAuthorize("hasRole('ROLE_ADMIN2')")
    @RequestMapping("/list")
    public String noteList() {
        return "noteList";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/add")
    @ResponseBody
    public String addNote(){
        return "Add note";
    }
}
