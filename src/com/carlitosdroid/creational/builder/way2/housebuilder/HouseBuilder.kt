package com.carlitosdroid.creational.builder.way2.housebuilder

import com.carlitosdroid.creational.builder.way2.product.House

interface HouseBuilder {

    fun buildBasement(basement: String)
    fun buildStructure()
    fun buildRoof()
    fun buildInterior()
    fun getResult(): House

}