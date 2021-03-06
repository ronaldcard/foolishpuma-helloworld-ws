package com.foolishpuma.helloworld.ws.ping

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [PingWSController::class])
class PingWSControllerTest {

    @Autowired
    lateinit var pingWSController: PingWSController

    @Test
    fun `context loads successfully`() {

        assertNotNull(this.pingWSController)
    }

    @Test
    fun `calling ping ws returns true`() {

        assertEquals(true, this.pingWSController.ping())
    }
}