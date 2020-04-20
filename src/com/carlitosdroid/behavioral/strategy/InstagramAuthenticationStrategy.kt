package com.carlitosdroid.behavioral.strategy

class InstagramAuthenticationStrategy: AuthenticationStrategy {
    override fun login(name: String, password: String) {
        println("Authenticating with Instagram...")
    }

    override fun logout() {
        println("Logging out with Instagram...")
    }
}