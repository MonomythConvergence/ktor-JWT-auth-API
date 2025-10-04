package com.example.domain

import com.example.utils.LocalPropertyGetterUtil
import java.nio.charset.StandardCharsets
import java.security.MessageDigest

class HashingInterfaceImpl : HashingInterface {
    override fun hash(string: String): ByteArray {
        val getter = LocalPropertyGetterUtil() //todo DI
        val pepperBytes = getter.get("pepper")?.toByteArray(StandardCharsets.UTF_8)
        val md = MessageDigest.getInstance("SHA-256")

        md.update(string.toByteArray(StandardCharsets.UTF_8))
        if (pepperBytes!=null) md.update(pepperBytes)
        return md.digest()
    }
}