package com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.app


import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.buttons.Button
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.checkboxs.CheckBox
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.factories.GUIFactory


class Application(guiFactory: GUIFactory) {
    private lateinit var button: Button
    private lateinit var checkBox: CheckBox
    init {
        button = guiFactory.createButton()
        checkBox = guiFactory.createCheckBox()
    }
    fun paint() {
        button.paint()
        checkBox.paint()
    }
}