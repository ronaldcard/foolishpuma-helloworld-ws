package com.foolishpuma.helloworld.ws

import com.foolishpuma.helloworld.ws.ping.PingWSController
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(PingWSController::class))
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