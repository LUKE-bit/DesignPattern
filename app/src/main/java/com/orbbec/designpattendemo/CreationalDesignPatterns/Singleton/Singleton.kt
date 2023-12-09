package com.orbbec.designpattendemo.CreationalDesignPatterns.Singleton

class Singleton(value: String) {
    val value: String = value
    companion object {
        @Volatile
        private var instance: Singleton? = null

        fun getInstance(value: String): Singleton? {
            synchronized(this){
                val result : Singleton? = instance
                if (result != null) {
                    return result
                }
                instance = Singleton(value)
                return instance
            }

        }
    }
}