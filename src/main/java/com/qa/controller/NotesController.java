package com.qa.controller;

import com.qa.model.Note;
import com.qa.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)

@RequestMapping("api/v1")
public class NotesController {

    @Autowired
    private NotesRepository notesRepository;

    @CrossOrigin("http://localhost:8080")
    @RequestMapping(value = "notes", method = RequestMethod.GET)
    public List<Note> list(){
        return notesRepository.findAll();
    }

    @RequestMapping(value = "notes", method = RequestMethod.POST)
    public Note create(@RequestBody Note note){
        return notesRepository.saveAndFlush(note);
    }

    @RequestMapping(value = "notes/{id}", method = RequestMethod.GET)
    public Note getNote(@PathVariable Long id){
        return notesRepository.findOne(id);
    }

    @RequestMapping(value = "notes/{id}", method = RequestMethod.DELETE)
    public Note delete(@PathVariable Long id){
        Note existingNote = notesRepository.findOne(id);
        notesRepository.delete(existingNote);
        return existingNote;
    }



}
