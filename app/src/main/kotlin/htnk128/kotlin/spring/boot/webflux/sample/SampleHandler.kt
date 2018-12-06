package htnk128.kotlin.spring.boot.webflux.sample

import org.springframework.http.MediaType.APPLICATION_JSON_UTF8
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Component
class SampleHandler {

    fun message(req: ServerRequest): Mono<ServerResponse> {
        return ok()
            .contentType(APPLICATION_JSON_UTF8)
            .body(Flux.just("{\"message\":\"hello\"}"), String::class.java)
    }
}
