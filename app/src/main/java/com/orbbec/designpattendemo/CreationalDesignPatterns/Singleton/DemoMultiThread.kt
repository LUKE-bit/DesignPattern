package com.orbbec.designpattendemo.CreationalDesignPatterns.Singleton

class DemoMultiThread {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            println(
                "If you see the same value, then singleton was reused (yay!)" + "\n" +
                        "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                        "RESULT:" + "\n"
            )
            val threadFoo = Thread(ThreadFoo())
            val threadBar = Thread(ThreadBar())
            threadFoo.start()
            threadBar.start()
        }
        class ThreadFoo : Runnable {
            override fun run() {
                val singleton = Singleton.getInstance("FOO")
                println(singleton?.value)
            }
        }

        class ThreadBar : Runnable {
            override fun run() {
                val singleton = Singleton.getInstance("BAR")
                println(singleton?.value)
            }
        }
    }
}