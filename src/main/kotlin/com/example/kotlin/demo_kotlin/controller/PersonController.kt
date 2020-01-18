package com.example.kotlin.demo_kotlin.controller

import com.example.kotlin.demo_kotlin.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*
import java.util.logging.Logger

@Controller
class HtmlController {

    var personService = PersonService()

    var user: String = ""

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Hello, User"
        model["personName"] = user
        return "index"
    }

    @RequestMapping("/person", method = [RequestMethod.POST])
    fun post(model: Model, @RequestParam("name") name: String): String {
        user = name
        model["personName"] = user
        println(personService.checkPerson(name))
        return "redirect:/"
    }

}