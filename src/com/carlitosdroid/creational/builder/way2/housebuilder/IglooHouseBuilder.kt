package com.carlitosdroid.creational.builder.way2.housebuilder

import com.carlitosdroid.creational.builder.way2.product.House

class IglooHouseBuilder : HouseBuilder {

    private val house: House = House()

    override fun buildBasement() {
        house.setBasement("Ice Bars")
    }

    override fun buildStructure() {
        house.setStructure("Ice Blocks")
    }

    override fun buildInterior() {
        house.setInterior("Ice Carvings")
    }

    override fun buildRoof() {
        house.setRoof("Ice Dome")
    }

    override fun getHouse(): House {
        return house
    }

}