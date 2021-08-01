package com.kdroid.kotlintuts.kotlin.controlsAndLoop

fun main(args: Array<String>) {

    // Loop in kotlins
    for(i in 1..10){
    //    println(i)
    }

    //while loop
    var i:Int=10
    while (i>10){
        i++
    }


    //break
    //labeled for loop
    myLoop@for (i in 1..3){
        for (j in 1..3){
            println("$i $j")
            if(i==2 && j==2)
                break@myLoop
        }
    }
}