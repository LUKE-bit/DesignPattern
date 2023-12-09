package com.orbbec.designpattendemo.CreationalDesignPatterns.Prototype.shapes

import java.util.Objects

class Circle(target: Circle? = null) : Shape(target) {
    var radius : Int = 0

    init {
        if (target != null) {
            this.radius = target.radius
        }
    }
    override fun clone(): Shape {
        return Circle(this)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Circle) return false
        val shape2 : Circle = other
        return shape2.radius == radius
    }
}