package com.carlitosdroid.creational.singleton

object Counter {
    private var count: Int = 0

    fun currentCount() = count

    fun increment() {
        ++count
    }
}