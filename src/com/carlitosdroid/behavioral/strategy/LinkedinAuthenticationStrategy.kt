package com.carlitosdroid.behavioral.strategy

class LinkedinAuthenticationStrategy: AuthenticationStrategy {
    override fun login(name: String, password: String) {
        println("Logging out with Linkedin...")
    }

    override fun logout() {
        println("Logging out with Linkedin...")
    }
}