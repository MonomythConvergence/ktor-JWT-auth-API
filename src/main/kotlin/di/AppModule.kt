package com.example.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val port: Int) {

    @Provides @Singleton
    fun providePort(): Int = port

}
