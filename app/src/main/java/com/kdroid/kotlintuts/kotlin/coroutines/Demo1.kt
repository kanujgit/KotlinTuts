package com.kdroid.kotlintuts.kotlin.coroutines

import kotlinx.coroutines.*


 fun main(args: Array<String>) = runBlocking{

    // launchCoroutineScope()
     function2("1")
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
//   val job= launch {
//
//       function1()
//       val  resultOne = withContext(Dispatchers.IO) {
//           function1() }
//        val resultTwo = withContext(Dispatchers.IO) { function2() }
//    }
}

fun function1() {
    for (i in 1..1000000)
    print(".")
    println()
}

fun function2(name:String) {
    var name= "$name kumar"
    println(name)
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
    var job1: Job? = null
    var job2:Job? = null
    coroutineScope {
         launch {
            job1= launch {
                delay(10000)
                println("Child coroutine end")
            }
            job2 =launch {
                job1!!.join()
                println("coroutine 2 start")
            }
        }

    }




}