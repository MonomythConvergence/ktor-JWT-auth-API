package com.example.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import io.ktor.server.engine.ApplicationEngine
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

@Module
class AppModule(private val port: Int) {

    @Provides @Singleton
    fun providePort(): Int = port

}
