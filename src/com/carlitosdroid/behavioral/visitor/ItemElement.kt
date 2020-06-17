package com.carlitosdroid.behavioral.visitor

interface ItemElement {
    fun accept(visitor: ShoppingCartVisitor): Int
}