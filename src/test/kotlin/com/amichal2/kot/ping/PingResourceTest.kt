package com.amichal2.kot.ping

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@WebMvcTest(PingResource::class)
class PingResourceTest() {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @MockBean
    lateinit var pingService: PingService

    @Test
    fun pingTest() {
        mockMvc.perform(
                get("/ping")
                        .header("User-Agent", "agent val")
                        .header("host", "host val"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"status\" : \"UP\"}"))
    }
}
