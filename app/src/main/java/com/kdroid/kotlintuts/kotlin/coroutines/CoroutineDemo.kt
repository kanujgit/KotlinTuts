package com.kdroid.kotlintuts.kotlin.coroutines

import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {


    println("Main program starts is : ${Thread.currentThread()}")
    val job: Deferred<Unit> = async {
        // create worker threads
        println("Fake works start ${Thread.currentThread()}")
        delay(1000)// Coroutine is suspend but Thread> Its free(Not blocked)
//        mySuspendFunction()
        println("Fake works  finish ${Thread.currentThread()}")

    }
    //  mySuspendFunction() // wait for coroutine to finish (bad idea)


//    job.join()

    job.await()
    //job.cancel()

    println("Main program ends : ${Thread.currentThread()}")

    //Create coroutine at local scope
//    launch {
//
//        // some data computation
//        // login operations
//    }

}

suspend fun mySuspendFunction() {
    delay(2000)
    GlobalScope.launch {
        //file downloaded
        // play music
    }

}
