package com.coderyu.springboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteController {

    @RequestMapping("/notes")
    public String noteList(){
        return "noteList";
    }
}
