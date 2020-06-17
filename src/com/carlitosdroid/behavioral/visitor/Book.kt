package com.carlitosdroid.behavioral.visitor

class Book(val price: Int, val isbnNumber: String): ItemElement {
    override fun accept(visitor: ShoppingCartVisitor): Int {
        return visitor.visit(this)
    }
}