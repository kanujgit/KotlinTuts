package com.kotlin.coroutines

import kotlinx.coroutines.*


fun main() {

    val errorHandler = CoroutineExceptionHandler { context, error ->
        when (error) {
            is IllegalStateException -> println("Illegal state exception")
            is ArithmeticException -> println("Arithmetics exception")
        }
    }
    runBlocking {

//        var a1 = async { println("Coroutine A1 ${Thread.currentThread().name}") }.await()
//        var a2 = async { println("Coroutine A2 ${Thread.currentThread().name}") }.await()
//        var a3 = async { println("Coroutine A3 ${Thread.currentThread().name}")  }.await()

        val scope = CoroutineScope(errorHandler)
        scope.launch {
            val a = async {
                println("I'm computing a piece of the answer")
                1 / 0
                throw IllegalStateException("")
            }.await()
            val b = async {
                println("I'm computing another piece of the answer")
            }.await()
            println("The answer is ")
        }

        val b = async {
            println("thread parent")
        }.await()


    }
}

