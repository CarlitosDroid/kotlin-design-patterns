package com.carlitosdroid.behavioral.strategy

class GoogleAuthenticationStrategy: AuthenticationStrategy {
    override fun login(name: String, password: String) {
        println("Authenticating with Google...")
    }

    override fun logout() {
        println("Logging out with Google...")
    }
}