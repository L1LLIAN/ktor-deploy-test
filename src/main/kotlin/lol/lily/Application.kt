package lol.lily

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import lol.lily.plugins.configureRouting
import lol.lily.plugins.configureSerialization

val START_TIME = System.currentTimeMillis()

fun main() {
    val port = System.getenv("KTOR_PORT")?.toInt() ?: 8080
    val host = System.getenv("KTOR_HOST") ?: "0.0.0.0"

    embeddedServer(Netty, port = port, host = host) {
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}
