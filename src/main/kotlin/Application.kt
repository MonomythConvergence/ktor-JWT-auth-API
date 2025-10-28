package com.example

import io.ktor.server.application.*

fun main(args: Array<String>) {
    val appComponent = DaggerAppComponent.create()
    val authService = appComponent.authService()

    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSecurity()
    configureSerialization()
    configureRouting()
}
