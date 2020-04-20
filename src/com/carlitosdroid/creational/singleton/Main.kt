package com.carlitosdroid.creational.singleton

object Main {

    /**
     * With a Singleton in Kotlin you can do data hiding and encapsulation
     * You can't even do val value1 = Counter.currentCount() and then
     */
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        Counter.increment()
        println(Counter.currentCount())

        //If you want to make this you won't be
        //var value1 = Counter.currentCount()
        //value1 = 200
        //println(Counter.currentCount() // still as 0
    }
}