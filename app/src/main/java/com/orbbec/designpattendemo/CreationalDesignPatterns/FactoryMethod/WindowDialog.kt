package com.orbbec.designpattendemo.CreationalDesignPatterns.FactoryMethod

class WindowDialog : Dialog() {
    override fun createButton(): Button {
        return WindowButton()
    }
}