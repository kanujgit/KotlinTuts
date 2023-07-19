package com.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job = launch {
          //  delay(2000)
            println("Job1 is launched")
            val job2 = launch {
                println("Job 2 launched")
                delay(2000)
                println("Job 2 finished")
            }

            job2.invokeOnCompletion { println("Job2 is cancelled") }

            val job3 = launch {
                println("Job3 is launched")
                delay(2000)
                println("Job3 is finished")
            }
            job3.invokeOnCompletion { println("Job3 is cancelled") }
        }

        job.invokeOnCompletion { println("Job 1 is cancelled") }
        delay(1000)
        println("Job 1 will be canceled")
        job.cancel()
    }
}