package com.example.utils

import com.example.domain.LocalPropertyGetter
import java.io.File
import java.io.FileInputStream
import java.util.Properties

class LocalPropertyGetterUtil : LocalPropertyGetter {

    override fun get(key: String): String? {
        val file = File("local.properties")
        if (file.exists()) {
            val props = Properties()
            props.load(FileInputStream(file))
            return props.getProperty(key)
        } else return null
    }
}