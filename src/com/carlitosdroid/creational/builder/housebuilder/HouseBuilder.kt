package com.carlitosdroid.creational.builder.housebuilder

import com.carlitosdroid.creational.builder.product.House

interface HouseBuilder {

    fun buildBasement()
    fun buildStructure()
    fun buildRoof()
    fun buildInterior()
    fun getHouse(): House

}