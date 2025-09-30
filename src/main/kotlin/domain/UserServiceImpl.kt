package com.example.domain

import com.example.model.TokenResponse
import com.example.model.User
import io.reactivex.rxjava3.core.Single

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