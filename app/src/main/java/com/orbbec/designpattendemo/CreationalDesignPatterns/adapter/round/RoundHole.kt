package com.orbbec.designpattendemo.CreationalDesignPatterns.adapter.round

class RoundHole(private val radius:Double) {
    fun getRadius() : Double {
        return radius
    }
    fun fits(peg:RoundPeg) : Boolean {
        return this.radius >= peg.getRadius()
    }
}