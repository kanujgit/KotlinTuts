package com.kotlin.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {
    runBlocking {
        launch(Dispatchers.Default) {
            println("First context : $coroutineContext")
            withContext(Dispatchers.IO) {
                println("Second context : $coroutineContext")
            }
            withContext(Dispatchers.Unconfined) {
                println("Third coroutine $coroutineContext")
            }
            println("Default coroutine $coroutineContext")
        }
    }
}