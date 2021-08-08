package com.kdroid.kotlintuts.kotlin.coroutines

import kotlinx.coroutines.*


 fun main(args: Array<String>) = runBlocking{

//===========================
//    println("A")
//    launch {
//        a()
//        b()
//        c()
//        println("C")
//    }
//    println("B")

    //=============
   val job= launch {

       function1()
       val  resultOne = withContext(Dispatchers.IO) {
           function1() }
        val resultTwo = withContext(Dispatchers.IO) { function2() }
    }
}

fun function1() {
    for (i in 1..1000000)
    print(".")
    println()
}

fun function2() {
    println("function2")
}




suspend fun a(){
//    delay(5000)
    println("aa")
}

suspend fun b(){
   // delay(10000)
    println("bb")
}
suspend fun c(){
       // delay(15000)
    println("cc")
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