package com.example.di

import com.example.domain.HashingInterface
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun hashingService(): HashingInterface

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance port: Int): AppComponent
    }
}