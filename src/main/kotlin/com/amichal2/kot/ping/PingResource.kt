package com.amichal2.kot.ping

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
class PingResource {

    @GetMapping(value = "/ping", produces = arrayOf("application/json"))
    fun ping(): String {
        return "{\"status\" : \"UP\"}"
    }
}
