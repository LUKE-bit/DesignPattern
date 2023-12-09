package com.orbbec.designpattendemo.CreationalDesignPatterns.adapter.round

open class RoundPeg() {
    private var radius:Double = 0.0

    constructor(radius:Double) : this() {
        this.radius = radius
    }

    open fun getRadius() : Double {
        return radius
    }

}