package com.kdroid.kotlintuts.controlsAndLoop

fun main(args: Array<String>) {

    val a = 2
    val b = 4
    // var maxVal: Int


    //if as expression
    var maxVal: Int = if (a > b) {
        println("A is greater")
        a
    } else {
        println("B is greater")
        b
    }


    // typical if conditions
//    if (a > b) {
//        maxVal = a;
//    } else {
//        maxVal = b;
//    }
    print(maxVal)


    //when as expression with range
    val x=10
    when(x){
      in 0..10-> println("X is 1")
//        !in 0..10-> println("X is 1")
        2-> print("X is 2")
        else -> print("X is unKnown")
    }


    // when as expression
    var  X=10
    var str: String =when(X){
        1-> "X is 1"
        2-> "X is 2"
        else -> {
            // execute last statement of block
            "x is unknown"
            "x is alien"
        }
    }
    println(str)
}