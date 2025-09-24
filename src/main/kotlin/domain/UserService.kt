package com.example.domain

import com.example.model.TokenResponse
import com.example.model.User
import io.reactivex.rxjava3.core.Single

interface UserService {
    fun logIn(email: String, password: String): Single<TokenResponse>
    fun getById(id: String): Single<User>
}