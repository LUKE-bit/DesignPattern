package com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.checkboxs

class MacOSCheckBox : CheckBox {
    override fun paint() {
        println("You have created MacOSCheckbox.")
    }
}