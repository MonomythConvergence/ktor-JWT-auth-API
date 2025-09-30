package com.example.domain

interface HashingInterface {
    fun hash(password : String) : ByteArray
}