package com.rmarcello.demo.controller;

import com.rmarcello.demo.beans.Note;
import com.rmarcello.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAll();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable int id) {
        return noteService.getById(id);
    }

    @PostMapping
    public void addNote(@RequestBody Note note) {
        noteService.add(note);
    }

    @DeleteMapping("/{id}")
    public void removeNote(@PathVariable int id) {
        noteService.remove(id);
    }

}
