package com.coroutines

import kotlinx.coroutines.*


 fun main(args: Array<String>) = runBlocking{

     val job = launch {

     }

     val job2 = launch {
         job.join()
     }


     //  launchCoroutineScope()
     myFunction()
     // function2("1")
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

suspend fun myFunction() {
    println("Before")
    delay(1000) // suspending
    println("After")
}

fun function1() {
    for (i in 1..1000000)
        print(".")
    println()
}

fun function2(name: String) {
    val context  =Dispatchers.Default

    var name = "$name kumar"
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
                //job1!!.join()
                delay(10000)
                println("coroutine 2 start")
            }
        }

    }




}