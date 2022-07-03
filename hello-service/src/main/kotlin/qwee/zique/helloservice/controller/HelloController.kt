package qwee.zique.helloservice.controller

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
    }

    @Value("\${message}")
    val message: String? = null

    @Value("\${general-message}")
    val generalMessage: String? = null

    @GetMapping
    fun getHello(): String = message ?: CONFIG_SERVER_ERROR

    @GetMapping("/general")
    fun getGeneral(): String = generalMessage ?: CONFIG_SERVER_ERROR
}