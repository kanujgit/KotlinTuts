package com.kotlin.collectionsAndFunctions

import android.os.Build
import androidx.annotation.RequiresApi


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
@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

    var myNumber: List<Int> = listOf(2, 3, 4, 5, 90)
    var myNumberMutableList: List<Int> = mutableListOf(2, 3, 4, 5, 90)


    for (Int in myNumberMutableList) {
        println(myNumberMutableList)
    }

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

    val numberSet = setOf<String>("22", "23")
    numberSet.forEach { println(it) }

    // map

    // no duplicate key
    val numberMap = mapOf<String, String>("1" to "balal","2" to "anuj")
    println(numberMap)

    numberMap.forEach { (t, u) -> println("$t and $u") }

}
