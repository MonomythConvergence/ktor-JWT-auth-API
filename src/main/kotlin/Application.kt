package com.example

import com.example.di.DaggerAppComponent
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

fun main(args: Array<String>) {
    val port = System.getenv("PORT")?.toIntOrNull() ?: 8080 //todo research to make sure
    val appComponent = DaggerAppComponent.factory().create(port)
    val hashing = appComponent.hashingService()

    io.ktor.server.netty.EngineMain.main(args)
}
//todo this next v
//routing {
//    post("/login") {
//        val req = call.receive<LoginRequest>()
//        // pass req.username and req.password to your AuthService
//        val token = authService.login(req.username, req.password)
//        if (token == null) {
//            call.respond(HttpStatusCode.Unauthorized, mapOf("error" to "invalid credentials"))
//        } else {
//            call.respond(mapOf("token" to token))
//        }
//    }
//}


fun Application.module() {
    configureSecurity()
    configureSerialization()
    configureRouting()
    install(ContentNegotiation) {
        json(Json { encodeDefaults = true; ignoreUnknownKeys = true })
    }
}
