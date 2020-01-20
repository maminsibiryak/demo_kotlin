package com.example.kotlin.demo_kotlin.controller

import com.example.kotlin.demo_kotlin.domain.Note
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@Controller
class NoteController {
    private val listOfNote = arrayListOf<Note>()

    @RequestMapping("/projects/notes",method = [RequestMethod.GET])
    fun getAllNotes(model: Model): String {
        listOfNote.add(Note(0, "some text"))
        listOfNote.add(Note(1, "some text"))
        listOfNote.add(Note(2, "some text"))
        model["listOfNote"]= listOfNote
        return "/projects/notes"
    }

}