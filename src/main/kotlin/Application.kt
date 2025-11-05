package com.example

import com.example.di.DaggerAppComponent
import io.ktor.server.application.*

fun main(args: Array<String>) {
    val port = System.getenv("PORT")?.toIntOrNull() ?: 8080 //todo research to make sure
    val appComponent = DaggerAppComponent.factory().create(port)
    val hashing = appComponent.hashingService()
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSecurity()
    configureSerialization()
    configureRouting()
}
