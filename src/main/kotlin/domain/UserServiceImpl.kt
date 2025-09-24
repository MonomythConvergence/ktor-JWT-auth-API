package com.example.domain

import com.example.model.TokenResponse
import com.example.model.User
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.TimeUnit

class UserServiceImpl : UserService {
    override fun logIn(
        email: String,
        password: String
    ): Single<TokenResponse> {
        TODO("Not yet implemented")
    }

    override fun getById(id: String): Single<User> {
        TODO("Not yet implemented")
    }


}