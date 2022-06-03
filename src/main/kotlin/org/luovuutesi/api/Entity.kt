package org.luovuutesi.api

interface Entity {
    val id: Long

    fun <T: Component> addComponent(component: T)
    fun <T: Component> getComponent(): T?
    fun <T: Component> removeComponent(): T?
}