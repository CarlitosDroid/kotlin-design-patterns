package com.carlitosdroid.behavioral.visitor

class Fruit(val pricePerKilogram: Int, val weight: Int, val name: String): ItemElement {
    override fun accept(visitor: ShoppingCartVisitor): Int {
        return visitor.visit(this)
    }
}