package com.carlitosdroid.creational.builder.way2.product

class House : HousePlan {
    private var basement: String? = null
    private var structure: String? = null
    private var roof: String? = null
    private var interior: String? = null

    override fun setBasement(basement: String) {
        this.basement = basement
    }

    override fun setStructure(structure: String) {
        this.structure = structure
    }

    override fun setRoof(roof: String) {
        this.roof = roof
    }

    override fun setInterior(interior: String) {
        this.interior = interior
    }
}