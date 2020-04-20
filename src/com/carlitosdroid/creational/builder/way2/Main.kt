package com.carlitosdroid.creational.builder.way2

import com.carlitosdroid.creational.builder.way2.director.HouseBuildDirector
import com.carlitosdroid.creational.builder.way2.housebuilder.IglooHouseBuilder
import com.carlitosdroid.creational.builder.way2.housebuilder.TipiHouseBuilder

object Main {
    @JvmStatic
    fun main(args: Array<String>) { // write your code here

        val houseBuildDirector = HouseBuildDirector()

        val iglooHouseBuilder = IglooHouseBuilder()
        houseBuildDirector.constructIgloo(iglooHouseBuilder)

        val tipiHouseBuilder = TipiHouseBuilder()
        houseBuildDirector.constructTipi(tipiHouseBuilder)

        val igloo = iglooHouseBuilder.getResult()
        val tipi = tipiHouseBuilder.getResult()

        println(igloo)
        print(tipi)
    }
}