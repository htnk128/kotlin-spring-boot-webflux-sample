package htnk128.kotlin.spring.boot.webflux.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse

@SpringBootApplication
class Application {

    @Bean
    fun routes(sampleRouter: SampleRouter): RouterFunction<ServerResponse> =
        sampleRouter.routes()
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
