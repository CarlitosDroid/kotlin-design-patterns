package com.carlitosdroid.behavioral.strategy

class ContextAuthenticator(private val authenticationStrategy: AuthenticationStrategy) {

    fun login(email: String, password: String){
        authenticationStrategy.login(email, password)
    }

    fun logout() {
        authenticationStrategy.logout()
    }
}