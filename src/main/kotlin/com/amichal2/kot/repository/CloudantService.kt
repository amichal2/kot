package com.amichal2.kot.repository

import com.amichal2.kot.repository.model.EventDocument
import com.cloudant.client.api.ClientBuilder
import com.cloudant.client.api.CloudantClient
import com.cloudant.client.api.Database
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.time.LocalTime

@Service
class CloudantService(@Value("\${db.name}") private val dbName: String) {
    fun saveEvent(userAgent: String, host: String) {
        val client: CloudantClient = ClientBuilder
                .bluemix(System.getenv("VCAP_SERVICES"))
                .build();

        val database: Database = client.database(dbName, false)
        database.save(EventDocument(userAgent, host, LocalTime.now()))
    }
}
