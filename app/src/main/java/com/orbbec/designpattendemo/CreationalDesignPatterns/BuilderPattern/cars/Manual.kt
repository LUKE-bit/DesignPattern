package com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.cars

import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.Engine
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.GPSNavigator
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.Transmission
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.TripComputer


class Manual(carType: CarType, seats: Int, engine: Engine, transmission: Transmission, tripComputer: TripComputer?, gpsNavigator: GPSNavigator?) {
    private val carType: CarType
    private val seats:Int
    private val engine: Engine
    private val transmission: Transmission
    private val tripComputer: TripComputer?
    private val gpsNavigator: GPSNavigator?

    init {
        this.carType = carType
        this.seats = seats
        this.engine = engine
        this.transmission = transmission
        this.tripComputer = tripComputer
        this.gpsNavigator = gpsNavigator
    }

    fun print(): String {
        var info = ""
        info += "Type of car: $carType\n"
        info += "Count of seats: $seats\n"
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n"
        info += "Transmission: $transmission\n"
        info += if (this.tripComputer != null) "Trip Computer: Functional" + "\n" else "Trip Computer: N/A" + "\n"
        info += if (gpsNavigator != null) "GPS Navigator: Functional" + "\n" else "GPS Navigator: N/A" + "\n"
        return info
    }
}