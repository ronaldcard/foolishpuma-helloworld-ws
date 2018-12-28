package com.foolishpuma.helloworld.application

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [ApplicationConfiguration::class])
class HelloWorldWSApplicationTests {

	@Autowired
	lateinit var applicationConfiguration: ApplicationConfiguration

	@Test
	fun contextLoads() {
		assertThat(this.applicationConfiguration).isNotNull
	}

}
