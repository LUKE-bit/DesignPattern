package com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.factories

import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.buttons.Button
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.checkboxs.CheckBox

interface GUIFactory {
    fun createButton() : Button
    fun createCheckBox() : CheckBox
}