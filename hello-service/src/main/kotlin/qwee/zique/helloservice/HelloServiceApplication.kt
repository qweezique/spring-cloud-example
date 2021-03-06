package qwee.zique.helloservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
class HelloServiceApplication

fun main(args: Array<String>) {
	runApplication<HelloServiceApplication>(*args)
}
