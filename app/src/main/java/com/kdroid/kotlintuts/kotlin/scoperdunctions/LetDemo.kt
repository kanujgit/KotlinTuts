package com.kdroid.kotlintuts.kotlin.scoperdunctions

/**
 * 'let'
 * Property 1: Refer to context  object by using 'it'
 * Property 2: Return value is the 'lambda result'
 */
class LetDemo {
}

fun main(args: Array<String>) {
//    val name: String? = "null"
//    var length = name?.let {
//        // code won't we executed
//        println(it.reversed())
//        println(it.capitalize(Locale.ROOT))
//        println(it.length)
//        it.length
//    }
//
//    println(length)

    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five")
    val list = numbers.map { it.length }.filter { it > 3 }.let {
        print("$it")
    }
    print(list)

}