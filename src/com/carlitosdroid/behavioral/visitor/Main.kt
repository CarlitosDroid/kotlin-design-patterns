package com.carlitosdroid.behavioral.visitor

object Main {

    /**
     * The visitor pattern
     * follow this link https://medium.com/swlh/behavioral-design-pattern-strategy-5e9d4df1898a
     */

    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        val items = arrayOf(Book(20, "1234"), Book(100, "5678"),
                Fruit(10, 2, "Banana"), Fruit(5, 5, "Apple"))
        val totalCost = calculatePrice(items)
        println("Total Cost = $totalCost")
    }

    private fun calculatePrice(items: Array<ItemElement>): Int {
        val visitor: ShoppingCartVisitor = ShoppingCartVisitorImpl()
        var sum = 0
        for (item in items) {
            sum += item.accept(visitor)
        }
        return sum
    }
}