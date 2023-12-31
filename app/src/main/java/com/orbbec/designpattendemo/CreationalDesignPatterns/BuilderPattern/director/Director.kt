package com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.director

import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.builders.Builder
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.cars.CarType
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.Engine
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.GPSNavigator
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.Transmission
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.TripComputer


class Director {
    fun constructSportsCar(builder: Builder) {
        builder.setCarType(CarType.SPORTS_CAR)
        builder.setSeats(2)
        builder.setEngine(Engine(3.0, 0.0))
        builder.setTransmission(Transmission.SEMI_AUTOMATIC)
        builder.setTripComputer(TripComputer())
        builder.setGPSNavigator(GPSNavigator())
    }

    fun constructCityCar(builder: Builder) {
        builder.setCarType(CarType.CITY_CAR)
        builder.setSeats(2)
        builder.setEngine(Engine(1.2, 0.0))
        builder.setTransmission(Transmission.AUTOMATIC)
        builder.setTripComputer(TripComputer())
        builder.setGPSNavigator(GPSNavigator())
    }

    fun constructSUV(builder: Builder) {
        builder.setCarType(CarType.SUV)
        builder.setSeats(4)
        builder.setEngine(Engine(2.5, 0.0))
        builder.setTransmission(Transmission.MANUAL)
        builder.setGPSNavigator(GPSNavigator())
    }
}