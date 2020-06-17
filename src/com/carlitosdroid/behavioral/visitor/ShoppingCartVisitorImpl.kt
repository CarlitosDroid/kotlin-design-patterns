package com.carlitosdroid.behavioral.visitor

class ShoppingCartVisitorImpl : ShoppingCartVisitor {

    override fun visit(fruit: Fruit): Int {
        return fruit.pricePerKilogram * fruit.weight
    }

    override fun visit(book: Book): Int {
        return if (book.price > 50) book.price - 5 else book.price
    }

}