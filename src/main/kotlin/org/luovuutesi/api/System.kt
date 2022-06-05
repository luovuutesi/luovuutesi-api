package org.luovuutesi.api

interface System {
    val requiredComponents: Collection<Class<*>>
        get() = setOf()

    fun beforeStart(context: Context, entities: Collection<Entity>) {}
    fun start(context: Context, entities: Collection<Entity>) {}
    fun afterStart(context: Context, entities: Collection<Entity>) {}

    fun beforeUpdate(context: Context, entities: Collection<Entity>) {}
    fun startUpdate(context: Context, entities: Collection<Entity>) {}
    fun afterUpdate(context: Context, entities: Collection<Entity>) {}

    fun beforeStop(context: Context, entities: Collection<Entity>) {}
    fun stop(context: Context, entities: Collection<Entity>) {}
    fun afterStop(context: Context, entities: Collection<Entity>) {}
}