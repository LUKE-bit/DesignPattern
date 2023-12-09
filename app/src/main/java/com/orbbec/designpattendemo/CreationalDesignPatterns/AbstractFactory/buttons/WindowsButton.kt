package com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.buttons

class WindowsButton : Button {
    override fun paint() {
        println("You have created WindowsButton")
    }
}