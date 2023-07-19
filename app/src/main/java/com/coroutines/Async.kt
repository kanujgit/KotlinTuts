package com.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun main() {
    runBlocking {
        val deferredFirstValue = async { getFirstRandomNumber() }
        val deferredSecondValue = async { getSecondRandomNumber() }
        println("Doing some processing")
        delay(100L)
//        val valueFirst = deferredFirstValue.await()
//        val valueSecond = deferredSecondValue.await()
        println("firstValue: ${deferredSecondValue.onAwait} and second value is $deferredFirstValue ")
    }
}


private suspend fun getFirstRandomNumber(): Int {
    delay(1000L)
    val value = Random.nextInt(100)
    println("First random value is $value")
    return value
}

private suspend fun getSecondRandomNumber(): Int {

    delay(1000L)
    val value = Random.nextInt(100)
    println("Second random value is $value")
    return value
}