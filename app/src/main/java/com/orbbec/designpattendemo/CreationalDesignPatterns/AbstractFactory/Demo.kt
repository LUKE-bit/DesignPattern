package com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory


import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.app.Application
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.factories.GUIFactory
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.factories.MacOSFactory
import com.orbbec.designpattendemo.CreationalDesignPatterns.AbstractFactory.factories.WindowsFactory
import java.util.Locale

class Demo {
    fun configureApplication(): Application {
        val osName = System.getProperty("os.name")?.lowercase(Locale.ROOT)
        val factory: GUIFactory = if (osName == "max") MacOSFactory() else WindowsFactory()
        return Application(factory)
    }
    fun main() {
        val app = configureApplication()
        app.paint()
    }
}