package com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.builders

import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.cars.CarType
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.Engine
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.GPSNavigator
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.Transmission
import com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components.TripComputer

interface Builder {
    fun setCarType(type: CarType)
    fun setSeats(seats: Int)
    fun setEngine(engine: Engine)
    fun setTransmission(transmission: Transmission)
    fun setTripComputer(tripComputer: TripComputer?)
    fun setGPSNavigator(gpsNavigator: GPSNavigator?)
}