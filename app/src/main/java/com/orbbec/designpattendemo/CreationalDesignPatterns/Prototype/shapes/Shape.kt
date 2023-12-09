package com.orbbec.designpattendemo.CreationalDesignPatterns.Prototype.shapes

import java.util.Objects

abstract class Shape() {
    var x :Int = 0
    var y :Int = 0
    var color : String = ""

    constructor(target:Shape?) : this() {
        if (target != null) {
            this.x = target.x
            this.y = target.y
            this.color = target.color
        }
    }
    abstract fun clone() : Shape

    override fun equals(other: Any?): Boolean {
        if (other !is Shape) return false
        val shape2 :Shape = other
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color,color)
    }
}