package com.amichal2.kot.ping

import com.amichal2.kot.repository.CloudantService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class PingService(val cloudantService: CloudantService) {

    val log: Logger = LoggerFactory.getLogger(PingService::class.java)

    init {
        log.info("initialization of PingService")
    }

    fun logEvent(userAgent: String, host: String) {
        log.info("Ping service start:")
        cloudantService.saveEvent(userAgent, host)
    }
}
