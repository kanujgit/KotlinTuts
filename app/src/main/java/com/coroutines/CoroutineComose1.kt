package com.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
//    val time = measureTimeMillis {
//        println("The answer is ${concurrentSum()}")
//    }
//    println("Completed in $time ms")

    try {
        failedConcurrentSum()
    } catch (e: Exception) {
        println("Computations failed")
    }
}

suspend fun failedConcurrentSum() = coroutineScope {
    val one = async<Int> {
        try {
        //    delay(5000) // Emulates very long computation
            42
        } finally {
            println("First child was cancelled")
        }
    }
    val two = async<Int> {
        println("Second child throws an exception")
        throw ArithmeticException()
    }
    one.await() + two.await()
}

suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSomethingUsefulOne() }
    val two = async { doSomethingUsefulTwo() }
    one.await() + two.await()
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    //delay(1000L) // pretend we are doing something useful here, too
    return 29
}
