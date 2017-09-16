package com.amichal2.kot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotApplication::class.java, *args)
}
