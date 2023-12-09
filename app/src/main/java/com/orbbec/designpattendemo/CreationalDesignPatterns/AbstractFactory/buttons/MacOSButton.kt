package com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.buttons

class MacOSButton : Button {
    override fun paint() {
        println("You have created MacOSButton")
    }
}