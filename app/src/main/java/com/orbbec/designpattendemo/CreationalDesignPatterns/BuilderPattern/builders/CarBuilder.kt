package com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.builders

import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.cars.Car
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.cars.CarType
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.Engine
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.GPSNavigator
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.Transmission
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.TripComputer


class CarBuilder:Builder {
    private lateinit var type: CarType
    private var seats = 0
    private lateinit var engine: Engine
    private lateinit var transmission: Transmission
    private var tripComputer: TripComputer? = null
    private var gpsNavigator: GPSNavigator? = null

    override fun setCarType(type: CarType) {
        this.type = type
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    override fun setTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun setTripComputer(tripComputer: TripComputer?) {
        this.tripComputer = tripComputer
    }

    override fun setGPSNavigator(gpsNavigator: GPSNavigator?) {
        this.gpsNavigator = gpsNavigator
    }

    fun getResult(): Car {
        return Car(type, seats, engine, transmission, tripComputer!!, gpsNavigator!!)
    }
}