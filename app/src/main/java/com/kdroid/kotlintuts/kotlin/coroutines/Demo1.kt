package com.kdroid.kotlintuts.kotlin.coroutines

import kotlinx.coroutines.*


fun main(args: Array<String>) = runBlocking  {
//    launch {
//        delay(200L)
//        println("Task execute over run blocking ")
//    }.invokeOnCompletion { "task is complete over run blocking" }
//    coroutineScope {
//        launch {
//            delay(50L)
//            println("Task from nested launch")
//        }.invokeOnCompletion {
//            println("nested coroutine is complete")
//            cancel()
//
//        }
//        delay(100L)
//        println("Task from coroutine scope")
//    }
//
//    println("Coroutine scope is over") // This line is not printed until the nested
//
//    val job: Job = launch {
//        launch {
//            println("First job started")
//            delay(3000)
//            println("First job finished")
//        }.invokeOnCompletion {
//            println("First job completed!")
//        }
//
//        launch {
//            println("Second job started")
//            delay(4000)
//            println("Second job finished")
//        }.invokeOnCompletion {
//            println("Second job completed!")
//        }
//
//        launch {
//            println("Third job started")
//            delay(5000)
//            println("Third job finished")
//        }.invokeOnCompletion {
//            println("Third job completed!")
//        }
//    }
//
//    delay(1000)
//    job.children.elementAt(2).cancel()
//    delay(750)
//    job.children.elementAt(0).cancel()
//    delay(500)
//    job.children.elementAt(0).cancel()


//    val job = launch {
//        println("Coroutine start")
//        launch {
//            println("Child coroutine start")
//            delay(1000)
//            println("Child coroutine end")
//        }
//        println("Coroutine end")
//    }
//    println("Join")
//    job.join()
//    println("Done")






    launch {
        println("1")
    }

    coroutineScope {
        launch {
            println("2")
        }

        println("3")
    }

    coroutineScope {
        launch {
            println("4")
        }

        println("5")
    }

    launch {
        println("6")
    }

    for (i in 7..100) {
        println(i.toString())
    }

    println("101")


}

suspend fun launchCoroutineScope() {
    coroutineScope {
        val job = launch {
            println("Coroutine start")
            launch {
                println("Child coroutine start")
                delay(1000)
                println("Child coroutine end")
            }
            println("Coroutine end")
        }
        println("Join")
        job.join()
        println("Done")
    }


}