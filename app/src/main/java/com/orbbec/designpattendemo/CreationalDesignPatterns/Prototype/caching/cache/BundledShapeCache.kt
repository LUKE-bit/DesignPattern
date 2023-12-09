package com.orbbec.designpattendemo.CreationalDesignPatterns.Prototype.caching.cache

import com.orbbec.designpattendemo.CreationalDesignPatterns.Prototype.shapes.Circle
import com.orbbec.designpattendemo.CreationalDesignPatterns.Prototype.shapes.Rectangle
import com.orbbec.designpattendemo.CreationalDesignPatterns.Prototype.shapes.Shape

class BundledShapeCache() {
    private var cache = HashMap<String,Shape>()
    init {
        var circle = Circle()
        circle.x = 5
        circle.y = 7
        circle.radius = 45
        circle.color = "Green"

        var rectangle = Rectangle()
        rectangle.x = 6
        rectangle.y = 9
        rectangle.width = 8
        rectangle.height = 10
        rectangle.color = "Blue"

        cache["Big green circle"] = circle
        cache["Medium blue rectangle"] = rectangle
    }
    fun put(key:String,shape:Shape) : Shape{
        cache[key] = shape
        return shape
    }
    fun get(key:String):Shape?{
        return cache[key]?.clone()
    }
}