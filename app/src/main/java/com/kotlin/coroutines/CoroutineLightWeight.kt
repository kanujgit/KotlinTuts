package com.kotlin.coroutines

import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {

    val job = launch {Dispatchers.Default
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            if(!isActive){
                println("Is Active")

            }
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancel() // cancels the job
    job.join() // waits for job's completion
    println("main: Now I can quit.")


}