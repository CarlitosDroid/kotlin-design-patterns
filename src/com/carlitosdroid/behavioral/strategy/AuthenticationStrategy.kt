package com.carlitosdroid.behavioral.strategy

interface AuthenticationStrategy {
    fun login(name: String, password: String)
    fun logout()
}
