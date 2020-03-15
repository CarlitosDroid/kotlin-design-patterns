package com.carlitosdroid.creational.builder.way2.director

import com.carlitosdroid.creational.builder.way2.housebuilder.HouseBuilder
import com.carlitosdroid.creational.builder.way2.product.House

class CivilEngineer(private val houseBuilder: HouseBuilder) {

    fun constructHouse() {
        houseBuilder.buildBasement()
        houseBuilder.buildStructure()
        houseBuilder.buildRoof()
        houseBuilder.buildInterior()
    }

    fun getHouse(): House {
        return houseBuilder.getHouse()
    }

}