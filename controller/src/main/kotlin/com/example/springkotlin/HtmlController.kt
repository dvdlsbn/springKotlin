package com.example.springkotlin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: String): String {
        return "blog"
    }

}