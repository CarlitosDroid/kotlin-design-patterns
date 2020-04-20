package com.carlitosdroid.behavioral.strategy

class FacebookAuthenticationStrategy: AuthenticationStrategy {
    override fun login(name: String, password: String) {
        println("Authenticating with Facebook...")
    }

    override fun logout() {
        println("Logging out with Facebook...")
    }
}