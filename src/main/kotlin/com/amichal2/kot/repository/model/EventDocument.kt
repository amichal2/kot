package com.amichal2.kot.repository.model

import java.time.LocalDateTime

data class EventDocument(val userAgent: String, val host: String, val timestamp: LocalDateTime)
