package com.example.domain

import java.nio.charset.StandardCharsets
import java.security.MessageDigest

class HashingInterfaceImpl(private val getter: LocalPropertyGetter) : HashingInterface {
    override fun hash(string: String): ByteArray {
        val pepperBytes = getter.get("pepper")?.toByteArray(StandardCharsets.UTF_8)
        val md = MessageDigest.getInstance("SHA-256")

        md.update(string.toByteArray(StandardCharsets.UTF_8))
        if (pepperBytes!=null) md.update(pepperBytes)
        return md.digest()
    }
}