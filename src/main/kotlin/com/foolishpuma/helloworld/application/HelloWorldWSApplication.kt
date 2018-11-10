package com.foolishpuma.helloworld.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.foolishpuma.helloworld"])
class HelloWorldWsApplication

fun main(args: Array<String>) {
    runApplication<HelloWorldWsApplication>(*args)
}
