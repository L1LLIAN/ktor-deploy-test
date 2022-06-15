package lol.lily

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import lol.lily.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureTemplating()
        configureSerialization()
    }.start(wait = true)
}
