package org.luovuutesi.api

interface Module {
    val moduleId: String

    fun start()

    fun stop()
}