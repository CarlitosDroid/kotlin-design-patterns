package com.carlitosdroid.creational.builder.way2

import com.carlitosdroid.creational.builder.way2.director.CivilEngineer
import com.carlitosdroid.creational.builder.way2.housebuilder.TipiHouseBuilder

object BuilderMain {
    @JvmStatic
    fun main(args: Array<String>) { // write your code here

        //val houseBuilder = IglooHouseBuilder()
        val houseBuilder = TipiHouseBuilder()
        val civilEngineer = CivilEngineer(houseBuilder)
        civilEngineer.constructHouse()

        val house = civilEngineer.getHouse()
        print(house)
    }
}