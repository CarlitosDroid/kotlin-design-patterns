package com.carlitosdroid.creational.builder

import com.carlitosdroid.creational.builder.director.CivilEngineer
import com.carlitosdroid.creational.builder.housebuilder.IglooHouseBuilder
import com.carlitosdroid.creational.builder.housebuilder.TipiHouseBuilder

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