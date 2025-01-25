package com.test.kotlinspring.controller

import ch.qos.logback.core.model.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class controller {

    @GetMapping("/hello")
    fun blog(): String {
        return "Hello"
    }
}