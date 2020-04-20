package com.carlitosdroid.behavioral.strategy

enum class SocialMedia {
    FACEBOOK, GOOGLE, INSTAGRAM, LINKEDIN
}

object Main {

    /**
     * The strategy pattern allows you to switch between algorithms in runtime.
     * follow this link https://medium.com/swlh/behavioral-design-pattern-strategy-5e9d4df1898a
     */

    @JvmStatic
    fun main(args: Array<String>) { // write your code here

        val socialMedia = SocialMedia.GOOGLE

        when(socialMedia) {
            SocialMedia.FACEBOOK -> {
                val contextAuthenticator = ContextAuthenticator(FacebookAuthenticationStrategy())
                contextAuthenticator.login("carlos@gmail.com", "123456")
                contextAuthenticator.logout()
            }
            SocialMedia.GOOGLE -> {
                val contextAuthenticator = ContextAuthenticator(GoogleAuthenticationStrategy())
                contextAuthenticator.login("carlos@gmail.com", "123456")
                contextAuthenticator.logout()
            }
            SocialMedia.INSTAGRAM -> {
                val contextAuthenticator = ContextAuthenticator(InstagramAuthenticationStrategy())
                contextAuthenticator.login("carlos@gmail.com", "123456")
                contextAuthenticator.logout()
            }
            SocialMedia.LINKEDIN -> {
                val contextAuthenticator = ContextAuthenticator(LinkedinAuthenticationStrategy())
                contextAuthenticator.login("carlos@gmail.com", "123456")
                contextAuthenticator.logout()
            }
        }
    }
}