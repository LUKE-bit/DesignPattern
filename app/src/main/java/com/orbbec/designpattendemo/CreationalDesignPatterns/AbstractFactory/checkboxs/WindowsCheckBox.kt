package com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.checkboxs

class WindowsCheckBox:CheckBox {
    override fun paint() {
        println("You have created WindowsCheckbox.")
    }
}