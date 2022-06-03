package org.luovuutesi.api

interface Entity {
    val id: Long

    fun <T : Component> addComponent(component: T)
    fun <T : Component> getComponent(componentClass: Class<T>): T?
    fun <T : Component> removeComponent(componentClass: Class<T>)
}