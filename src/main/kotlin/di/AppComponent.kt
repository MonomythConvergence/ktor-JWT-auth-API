package com.example.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    //fun authService(): AuthService
    //fun jwtService(): JwtService
}