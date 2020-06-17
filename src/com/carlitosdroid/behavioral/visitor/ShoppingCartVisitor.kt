package com.carlitosdroid.behavioral.visitor

interface ShoppingCartVisitor {
    fun visit(fruit: Fruit): Int
    fun visit(book: Book): Int
}
