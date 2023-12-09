package com.orbbec.designpattendemo.CreationalDesignPatterns.FactoryMethod

abstract class Dialog {
    //must have way to return product
    abstract fun createButton():Button

    fun renderWindow() {
        val okButton = createButton()
        okButton.render()
    }
}