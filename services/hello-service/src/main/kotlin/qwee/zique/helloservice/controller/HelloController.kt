package qwee.zique.helloservice.controller

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RefreshScope
@RequestMapping("/hello")
class HelloController {
    companion object {
        private const val CONFIG_SERVER_ERROR = "CONFIG SERVER ERROR"
        private val logger = KotlinLogging.logger { Companion::class.java.name }
    }

    @Value("\${message}")
    val message: String? = null

    @Value("\${general-message}")
    val generalMessage: String? = null

    @GetMapping
    fun getHello(): String {
        logger.info("this is hello message from service")
        return message ?: CONFIG_SERVER_ERROR
    }

    @GetMapping("/general")
    fun getGeneral(): String = generalMessage ?: CONFIG_SERVER_ERROR

    @GetMapping("/general/test")
    fun getTest(): String = "Test message"
}