package org.luovuutesi.api

interface Module {
    val moduleId: String

    fun start(context: Context)

    fun stop(context: Context)
}