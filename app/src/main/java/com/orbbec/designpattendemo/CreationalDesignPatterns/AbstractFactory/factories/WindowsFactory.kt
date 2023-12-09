package com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.factories

import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.buttons.Button
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.buttons.WindowsButton
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.checkboxs.CheckBox
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.checkboxs.WindowsCheckBox


class WindowsFactory:GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckBox(): CheckBox {
        return WindowsCheckBox()
    }
}