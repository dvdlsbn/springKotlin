package com.example.springkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackageClasses=HtmlController ::class.java)
class SpringkotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringkotlinApplication>(*args)
}
