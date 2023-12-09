package com.orbbec.designpattendemo.CreationalDesignPatterns.FactoryMethod

class Client {
    private lateinit var dialog: Dialog

    fun start(){
        configure()
        runBusinessLogic()
    }
    private fun configure() {
        dialog = if (System.getProperty("os.name").equals("Windows 10")) {
            WindowDialog()
        }else{
            HtmlDialog()
        }
    }
    private fun runBusinessLogic() {
        dialog.renderWindow()
    }
}