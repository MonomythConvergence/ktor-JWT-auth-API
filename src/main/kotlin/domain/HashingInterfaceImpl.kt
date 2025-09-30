package com.example.domain

class HashingInterfaceImpl : HashingInterface {
    override fun hash(password: String): ByteArray {
    return ByteArray(0) //todo add SHA-256 hashing + pepper
    }
}