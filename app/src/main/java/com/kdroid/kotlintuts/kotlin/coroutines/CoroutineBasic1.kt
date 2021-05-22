package com.kdroid.kotlintuts.kotlin.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun main() {
    GlobalScope.launch {
        delay(200)
        print("Kumar")
    }

    print("Anuj ")
    Thread.sleep(500)
}

