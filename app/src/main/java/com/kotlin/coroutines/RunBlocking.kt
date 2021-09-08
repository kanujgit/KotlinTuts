package com.kotlin.coroutines

import kotlinx.coroutines.*

fun main() {
    println("..........start run blocking .....")
    runBlocking {
        launch {
            delay(1000L)
            println("task from run blocking")
        }

        GlobalScope.launch {
            delay(1500L)
            println("--global scope launch---")
        }

        coroutineScope {
            launch {
                delay(1500L)
                println("--local scope launch---")
            }
        }
    }
    println("..........end run blocking......")

}