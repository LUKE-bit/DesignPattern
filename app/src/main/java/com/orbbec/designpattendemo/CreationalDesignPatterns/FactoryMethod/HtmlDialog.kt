package com.orbbec.designpattendemo.CreationalDesignPatterns.FactoryMethod

class HtmlDialog : Dialog() {
    override fun createButton(): Button {
        return HtmlButton()
    }
}