package com.amichal2.kot.ping

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@RestController()
class PingResource(private val pingService: PingService) {

    val log: Logger = LoggerFactory.getLogger(PingResource::class.java)

    @GetMapping(value = "/ping", produces = arrayOf("application/json"))
    fun ping(@RequestHeader("User-Agent") userAgent: String, @RequestHeader("host") host: String): String {
        log.debug("userAgent: $userAgent")
        pingService.logEvent(userAgent, host)
        return "{\"status\" : \"UP\"}"
    }
}
