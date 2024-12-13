package kan9hee.nolaejui_eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class NolaejuiEurekaApplication

fun main(args: Array<String>) {
	runApplication<NolaejuiEurekaApplication>(*args)
}
