package com.carlitosdroid.creational.builder.way1

class Task private constructor(
        private val name: String?,
        private val date: String?) {

    class Builder(
            private var name: String? = null,
            private var date: String? = null) {

        fun name(name: String) = apply { this.name = name }
        fun date(date: String) = apply { this.date = date }
        fun build() = Task(name, date)
    }

}