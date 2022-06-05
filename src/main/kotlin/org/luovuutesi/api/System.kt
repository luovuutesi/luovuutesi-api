package org.luovuutesi.api

interface System {
    val requiredComponents: Collection<Class<*>>
        get() = setOf()

    fun run(context: Context, entities: Collection<Entity>)
}