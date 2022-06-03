package org.luovuutesi.api

interface Context {
    fun createEntity(): Entity
    fun destroyEntity(entity: Entity)
}