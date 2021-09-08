package com.kotlin.coroutines

import kotlinx.coroutines.*

fun main() {
    runBlocking {

        val myHandlerException: CoroutineExceptionHandler =
            CoroutineExceptionHandler { coroutineContext, throwable ->
                println("Exception handled : ${throwable.localizedMessage} and context is : $coroutineContext")
            }
        val job = GlobalScope.launch(myHandlerException) {
            println("Throwing exception from main")
            throw IndexOutOfBoundsException()
        }
        job.join()


        val deferred = GlobalScope.async {
            println("Throwing from async")
            throw java.lang.IndexOutOfBoundsException()
        }

        try {
            deferred.await()
        }catch (e: Exception){
            println("caught exception: $e")
        }

    }
}