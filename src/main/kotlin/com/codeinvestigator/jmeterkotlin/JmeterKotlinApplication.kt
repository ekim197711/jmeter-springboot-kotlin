package com.codeinvestigator.jmeterkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JmeterKotlinApplication

fun main(args: Array<String>) {
    runApplication<JmeterKotlinApplication>(*args)
}
