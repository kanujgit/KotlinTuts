package com.kdroid.kotlintuts.kotlin.coroutines.actors

import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking



fun main(args: Array<String>)  = runBlocking{

    val printer   = actor<Int>(coroutineContext) {
        for (i in channel){
            println(i)
        }
    }
    launch {  }

  val job =  launch(coroutineContext) {
        repeat(10){
            i -> delay(100)
            printer.send(i)
        }
        printer.close()
    }




}