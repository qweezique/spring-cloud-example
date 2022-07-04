package qwee.zique.goodbyeservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.context.config.annotation.RefreshScope

@SpringBootApplication
@RefreshScope
class GoodbyeServiceApplication

fun main(args: Array<String>) {
	runApplication<GoodbyeServiceApplication>(*args)
}
