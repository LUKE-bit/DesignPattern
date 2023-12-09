package com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern

import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.builders.CarBuilder
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.builders.CarManualBuilder
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.director.Director


class Demo {
    fun main() {
        val director = Director()

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        val builder = CarBuilder()
        director.constructSportsCar(builder)

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        val car = builder.getResult()
        println("Car built:\n" + car.getCarType())


        val manualBuilder = CarManualBuilder()
        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder)
        val carManual = manualBuilder.getResult()
        println("\nCar manual built:\n" + carManual.print())
    }

}