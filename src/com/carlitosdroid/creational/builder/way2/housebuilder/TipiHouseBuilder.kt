package com.carlitosdroid.creational.builder.way2.housebuilder

import com.carlitosdroid.creational.builder.way2.product.House

class TipiHouseBuilder : HouseBuilder {

    private val house: House = House()

    override fun buildBasement() {
        house.setBasement("Wooden Poles")
    }

    override fun buildStructure() {
        house.setStructure("Wood and Ice")
    }

    override fun buildInterior() {
        house.setInterior("Fire Wood")
    }

    override fun buildRoof() {
        house.setRoof("Wood, caribou and seal skins")
    }

    override fun getHouse(): House {
        return house
    }

}