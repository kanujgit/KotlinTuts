package com.kdroid.kotlintuts.kotlin.collectionsAndFunctions


/**
 * FILTER
 * Returns a list containing only elements matching the given [Predicate]
 *
 * MAP
 * Return a list containing the result of applying the given [transform] function
 * to each element in the original collections
 *
 * ALL
 * Return that satisfy the conditions
 */
fun main(args: Array<String>) {

    var myNumber: List<Int> = listOf(2, 3, 4, 5, 90)
    val myFilterList = myNumber.filter { it > 3 }   // or item -> item<3
    for (num in myFilterList) {
        //  println(num)
    }

    val myMapedlist = myNumber.map { it * it }  // or item ->item*item
    for (item in myMapedlist) {
        // println(item)
    }

    val myFilterMappedList = myNumber.filter { it > 3 }.map { it * it }
    for (item in myFilterMappedList) {
        //    println(item)
    }

    val check = myNumber.all { it > 10 }   // false : All number are not greater 10
    println("test all keywords $check")


    val checkAny = myNumber.any({ it > 10 }) // true
    println("check any keywords $checkAny")

    val checkCount = myNumber.count { it > 10 }
    println("total number is $checkCount")


    //predicates
}
