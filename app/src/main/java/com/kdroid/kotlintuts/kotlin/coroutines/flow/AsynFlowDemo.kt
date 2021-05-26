package com.kdroid.kotlintuts.kotlin.coroutines.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main() {
    runBlocking {
//        println("receiving prime number")
//        sendPrimeNumberFlow().collect {
//            println("received prime number: $it")
//        }
//        println("finished received number")
//
//        sendNumber().collect {
//            println("Number is $it")
//        }
//        sendNumberAsFlow().collect {
//            println("Number is $it")
//        }
//        sendNumberFlowOf().collect {
//            println("Number is $it")
//        }


        val  numberFlowException = sendNumberFlowForCancellation()
        withTimeoutOrNull(1000L) {
            numberFlowException.collect {
                println("$it")
            }
        }


    }
}

fun sendPrimeNumberFlow(): Flow<Int> = flow {
    val primeNumber = listOf<Int>(1, 3, 5, 7, 11, 13, 17, 19)
    primeNumber.forEach {
        //   delay( 100L)
        emit(it)
    }
}

fun sendNumber() = flow {
    for (i in 1..10) {
        emit(i)
    }
}

fun sendNumberAsFlow() = listOf<Int>(1, 2, 3).asFlow()

fun sendNumberFlowOf() = flowOf(1, 2, 3)

fun sendNumberFlowForCancellation() = flow {
    listOf<Int>(1, 3, 4, 5).forEach {
        delay(400L)
        emit(it)
    }
}
