package com.carlitosdroid.creational.builder.way2.housebuilder

import com.carlitosdroid.creational.builder.way2.product.House

interface HouseBuilder {

    fun buildBasement()
    fun buildStructure()
    fun buildRoof()
    fun buildInterior()
    fun getHouse(): House

}