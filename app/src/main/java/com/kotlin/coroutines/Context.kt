package com.kotlin.coroutines

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch(CoroutineName("My Coroutine")) {
            println("this is run blocking from ${coroutineContext[CoroutineName.Key]}")
        }
        GlobalScope.launch {
            println("this is  global scope from ${coroutineContext[CoroutineName.Key]}")

        }
    }
}