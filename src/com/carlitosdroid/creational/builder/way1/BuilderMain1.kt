package com.carlitosdroid.creational.builder.way1

import com.carlitosdroid.creational.builder.way1.Task

object BuilderMain1 {
    @JvmStatic
    fun main(args: Array<String>) { // write your code here

        val task = Task.Builder()
                .name("carlos")
                .date("december")
                .build()

        print(task)
    }
}