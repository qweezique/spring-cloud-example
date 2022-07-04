package qwee.zique.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class GatewayApplication

fun main(args: Array<String>) {
    runApplication<GatewayApplication>(*args)
}

//@Bean
//fun myRoutes(builder: RouteLocatorBuilder): RouteLocator? {
//    return builder.routes().route { p ->
//        p.path("/hello")
//            .uri("lb://HELLO-SERVICE/hello")
//    }.build()
//}

