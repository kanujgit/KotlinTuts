package com.kotlin.sigleton

class SingletonDemoKotlin private constructor() {
    init {
        println("init block execute")
    }

    companion object {

        @Volatile
        private var instance: SingletonDemoKotlin? = null

        fun getInstance(): SingletonDemoKotlin {
            return instance ?: synchronized(this) {
                instance ?: SingletonDemoKotlin().also { instance = it }
            }
        }
    }
}