package com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.cars

import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.Engine
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.GPSNavigator
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.Transmission
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.TripComputer


class Car(carType: CarType, seats: Int, engine: Engine, transmission: Transmission, tripComputer: TripComputer, gpsNavigator: GPSNavigator) {
    private val carType: CarType
    private val seats:Int
    private val engine: Engine
    private val transmission: Transmission
    private val tripComputer: TripComputer
    private val gpsNavigator: GPSNavigator
    private var fuel = 0.0

    init {
        this.carType = carType
        this.seats = seats
        this.engine = engine
        this.transmission = transmission
        this.tripComputer = tripComputer
        this.gpsNavigator = gpsNavigator
        this.fuel = fuel
    }

    fun getCarType(): CarType {
        return carType
    }

    fun getFuel(): Double {
        return fuel
    }

    fun setFuel(fuel: Double) {
        this.fuel = fuel
    }

    fun getSeats(): Int {
        return seats
    }

    fun getEngine(): Engine {
        return engine
    }

    fun getTransmission(): Transmission {
        return transmission
    }

    fun getTripComputer(): TripComputer {
        return tripComputer
    }

    fun getGpsNavigator(): GPSNavigator {
        return gpsNavigator
    }
}