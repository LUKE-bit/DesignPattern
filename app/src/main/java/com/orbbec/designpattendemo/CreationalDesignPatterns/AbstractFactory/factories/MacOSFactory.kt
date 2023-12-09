package com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.factories

import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.buttons.Button
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.buttons.MacOSButton
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.checkboxs.CheckBox
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.checkboxs.MacOSCheckBox


class MacOSFactory : GUIFactory {
    override fun createButton(): Button {
        return MacOSButton()
    }

    override fun createCheckBox(): CheckBox {
        return MacOSCheckBox()
    }
}