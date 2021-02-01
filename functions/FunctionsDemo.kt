package com.kdroid.kotlintuts.functions

fun main(args: Array<String>) {
    var largeVal = max(4, 5)
    println("the larges val is $largeVal")
}

// typical if conditions code
//fun max(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}

// function as expression
//fun max(a: Int, b: Int): Int   =  if(a>b) a else b

// convert as a body
fun max(a: Int, b: Int): Int = if (a > b) {
    println("$a is a greater")
    a
} else {
    println("$b is a greater")
    b
    // return always last value f block
    98
}