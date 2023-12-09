package com.orbbec.designpattendemo.CreationalDesignPatterns.Prototype.shapes

class Rectangle(target: Rectangle? = null) : Shape(target) {
    var width : Int = 0
    var height : Int = 0

    init {
        if (target != null) {
            this.width = target.width
            this.height = target.height
        }
    }

    override fun clone(): Shape {
        return Rectangle(this)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Rectangle) return false
        val shape2 : Rectangle = other
        return shape2.width == width && shape2.height == height
    }

}