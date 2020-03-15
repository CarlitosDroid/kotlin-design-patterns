package com.carlitosdroid.creational.builder.way2.housebuilder

import com.carlitosdroid.creational.builder.way2.product.House

class TipiHouseBuilder : HouseBuilder {

    private var basement: String? = null
    private var structure: String? = null
    private var roof: String? = null
    private var interior: String? = null

    override fun buildBasement(basement: String) {
        this.basement = basement
    }

    override fun buildStructure() {
        structure = "Wood and Ice"
    }

    override fun buildInterior() {
        roof = "Fire Wood"
    }

    override fun buildRoof() {
        interior = "Wood, caribou and seal skins"
    }

    override fun getResult(): House {

        if (basement == null || structure == null || roof == null|| interior == null) {
            throw IllegalStateException("One field is null")
        }

        return House(basement, structure, roof, interior)
    }

}