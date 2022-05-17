package com.example.start_spring_boot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StartSpringBootApplication

fun main(args: Array<String>) {
    runApplication<StartSpringBootApplication>(*args)
}
