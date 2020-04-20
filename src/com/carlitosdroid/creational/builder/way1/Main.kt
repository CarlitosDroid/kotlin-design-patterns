package com.carlitosdroid.creational.builder.way1

import com.carlitosdroid.creational.builder.way1.Task

object Main {
    @JvmStatic
    fun main(args: Array<String>) { // write your code here

        val task1 = Task.Builder()
                .name("make a cake")
                .date("december")
                .build()

        val task2 = Task.Builder()
                .name("do homework")
                .date("august")
                .build()

        println(task1)
        print(task2)
    }
}