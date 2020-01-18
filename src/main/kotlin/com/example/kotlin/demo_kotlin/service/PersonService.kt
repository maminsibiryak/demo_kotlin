package com.example.kotlin.demo_kotlin.service

class PersonService {
    fun checkPerson(name: String) :String {
        if (name == "Andrey") {
            return "$name is Admin"
        }
        return "null"
    }
}