package com.carlitosdroid.creational.builder.way2.director

import com.carlitosdroid.creational.builder.way2.housebuilder.HouseBuilder

class HouseBuildDirector() {

    fun constructIgloo(houseBuilder: HouseBuilder) {
        houseBuilder.buildBasement("Ice Bars")
        houseBuilder.buildStructure()
        houseBuilder.buildRoof()
        houseBuilder.buildInterior()
    }

    fun constructTipi(houseBuilder: HouseBuilder) {
        houseBuilder.buildBasement("Wooden Poles")
        houseBuilder.buildStructure()
        houseBuilder.buildRoof()
        houseBuilder.buildInterior()
    }

}