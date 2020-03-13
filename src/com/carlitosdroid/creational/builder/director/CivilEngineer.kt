package com.carlitosdroid.creational.builder.director

import com.carlitosdroid.creational.builder.product.House
import com.carlitosdroid.creational.builder.housebuilder.HouseBuilder

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