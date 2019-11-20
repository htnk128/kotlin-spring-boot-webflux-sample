package htnk128.kotlin.spring.boot.webflux.sample

import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class SampleRouter(private val sampleHandler: SampleHandler) {

    fun routes(): RouterFunction<ServerResponse> = router {
        accept(APPLICATION_JSON).nest {
            GET("/", sampleHandler::message)
        }
    }
}
