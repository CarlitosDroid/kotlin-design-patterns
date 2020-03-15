package com.carlitosdroid.creational.builder.way2.housebuilder

import com.carlitosdroid.creational.builder.way2.product.House

class IglooHouseBuilder : HouseBuilder {

    private var basement: String? = null
    private var structure: String? = null
    private var roof: String? = null
    private var interior: String? = null

    override fun buildBasement(basement: String) {
        this.basement = basement
    }

    override fun buildStructure() {
        structure = "Ice Blocks"
    }

    override fun buildInterior() {
        roof = "Ice Carvings"
    }

    override fun buildRoof() {
        interior = "Ice Dome"
    }

    override fun getResult(): House {

        if (basement == null || structure == null || roof == null|| interior == null) {
            throw IllegalStateException("One field is null")
        }

        return House(basement, structure, roof, interior)
    }

}