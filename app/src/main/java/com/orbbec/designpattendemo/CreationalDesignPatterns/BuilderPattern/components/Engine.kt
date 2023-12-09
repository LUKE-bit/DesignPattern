package com.orbbec.designpattendemo.CreationalDesignPatterns.BuilderPattern.components

class Engine(volume: Double,mileage: Double) {
    private var volume = 0.0
    private var mileage = 0.0
    private var started = false

    init {
        this.volume = volume
        this.mileage = mileage
    }

    fun on() {
        started = true
    }

    fun off() {
        started = false
    }

    fun isStarted(): Boolean {
        return started
    }

    fun go(mileage: Double) {
        if (started) {
            this.mileage += mileage
        } else {
            System.err.println("Cannot go(), you must start engine first!")
        }
    }

    fun getVolume(): Double {
        return volume
    }

    fun getMileage(): Double {
        return mileage
    }
}