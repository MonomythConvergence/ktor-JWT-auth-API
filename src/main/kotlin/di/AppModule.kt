package com.example.di

import com.example.domain.HashingInterface
import com.example.domain.HashingInterfaceImpl
import com.example.domain.LocalPropertyGetter
import com.example.utils.LocalPropertyGetterUtil
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule() {

    @Provides
    @Singleton
    fun provideGetter(): LocalPropertyGetter {
        return LocalPropertyGetterUtil()
    }

    @Provides
    @Singleton
    fun provideHashingInterface(getter: LocalPropertyGetter): HashingInterface =
        HashingInterfaceImpl(getter)

}
