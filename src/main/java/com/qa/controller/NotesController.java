package com.qa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class NotesController {

    @RequestMapping(value = "notes", method = RequestMethod.GET)
    public List<Note> list(){

    }

}
