package com.kotlin.coroutines

import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {

    println("Main program start ::${Thread.currentThread()}")
    val job = launch(Dispatchers.Default) {
        try {
            for (i in 0..500) {
                print(" $i ")
                yield()
            }
        }catch (ex : CancellationException){
            println("\n Exception caught in safely ")
        }finally {
            withContext(NonCancellable){
                delay(10)
                println("Close all resources in finally")
            }

        }

    }
    delay(10)
    job.join()
    println("\n main programm terminate ${Thread.currentThread()}")
}