package com.kotlin.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    System.setProperty("kotlinx.coroutines.debug", "on" )

// //   printWorld()
//    val job = launch {
//        delay(2000)
//        println("World")
//    }
//    println("Hello")
//    job.cancelAndJoin()
//    println("Done")

    println("runBlocking ${Thread.currentThread()}")

    // launch a coroutine to process some kind of incoming request
        val request = launch {
            println("launch ${Thread.currentThread()}")
            // it spawns two other jobs
            launch(Job()) {
                println("launch ${Thread.currentThread()}")

                println("job1: I run in my own Job and execute independently!")
                delay(1000)
                println("job1: I am not affected by cancellation of the request")
            }
            // and the other inherits the parent context
            launch {
                println("launch ${Thread.currentThread()}")

                delay(100)
                println("job2: I am a child of the request coroutine")
                delay(1000)
                println("job2: I will not execute this line if my parent request is cancelled")
            }
        }
        delay(500)
        request.cancel() // cancel processing of the request
        delay(1000) // delay a second to see what happens
        println("main: Who has survived request cancellation?")


}

suspend fun printWorld() = coroutineScope {

    coroutineScope {

        coroutineScope {
            launch {
                delay(2000)
                println("Nested 2 World2")
            }
            launch {
                delay(1000)
                println("nested 2 World1")
                throw NullPointerException("Exception")
            }
            println(" nested 2World0")
        }
        launch {
            delay(2000)
            println("World2")
        }
        launch {
            delay(1000)
            println("World1")
        }
        println("World0")
    }
}




