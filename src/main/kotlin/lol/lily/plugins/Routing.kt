package lol.lily.plugins

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.p
import lol.lily.START_TIME

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondHtml {
                body {
                    h1 { +"Ktor Deploy Test" }
                    p { +"Started at $START_TIME" }
                }
            }
        }
    }
}
