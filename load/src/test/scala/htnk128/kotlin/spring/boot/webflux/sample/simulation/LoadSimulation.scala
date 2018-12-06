package htnk128.kotlin.spring.boot.webflux.sample.simulation

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class LoadSimulation extends Simulation {

  val hpb: HttpProtocolBuilder = http
    .baseUrl("http://localhost:8080/")
    .acceptHeader("application/json")

  val sb: ScenarioBuilder = scenario("Spring Boot WebFlux").exec(http("request_1").get(""))

  setUp(sb.inject(constantUsersPerSec(200) during (60 seconds)).protocols(hpb))
}
