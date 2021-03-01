package com.kdroid.kotlintuts.kotlin.scoperdunctions

/**
 * +-------------------------------------------+
 * Function | Context Object |  Return Value   |
 *+--------------------------------------------+
 * let            it            lambda result  |
 * run            this          lambda result  |
 * with           this          lambda result  |
 * apply          this          Context Object |
 * also           it            Context Object |
 *+--------------------------------------------+
 */

/**
 * 'let'
 * Property 1: Refer to context  object by using 'it'
 * Property 2: Return value is the 'lambda result'
 * null safety
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

    var name:String?=null
    name = "anuj"
    // also checking for null safety
    val length = name?.let{
        it.reversed()
//        println(it.length)
    }
    println(length)

    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five")
    val list = numbers.map { it.length }.filter { it > 3 }.let {
        print("$it")
        it
    }
    print(list)

}