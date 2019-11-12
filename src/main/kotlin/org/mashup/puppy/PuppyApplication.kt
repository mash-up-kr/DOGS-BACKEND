package org.mashup.puppy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PuppyApplication

fun main(args: Array<String>) {
	runApplication<PuppyApplication>(*args)
}
