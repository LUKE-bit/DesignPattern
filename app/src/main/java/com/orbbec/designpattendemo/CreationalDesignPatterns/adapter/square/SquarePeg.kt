package com.orbbec.designpattendemo.CreationalDesignPatterns.adapter.square

class SquarePeg(private val width:Double) {
    fun getWidth() : Double {
        return width
    }
    fun getSquare() : Double {
        return width * width
    }
}