package com.orbbec.designpattendemo.CreationalDesignPatterns.adapter.adapters

import com.orbbec.designpattendemo.CreationalDesignPatterns.adapter.round.RoundPeg
import com.orbbec.designpattendemo.CreationalDesignPatterns.adapter.square.SquarePeg
import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegAdapter(private val peg: SquarePeg) : RoundPeg() {
    override fun getRadius(): Double {
        return (sqrt((peg.getWidth()*1.0 / 2).pow(2) * 2))
    }
}