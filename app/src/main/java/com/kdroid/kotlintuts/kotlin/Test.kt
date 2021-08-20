package com.kdroid.kotlintuts.kotlin

data class Dog(val id: Int, var name: String)

fun main(args: Array<String>) {

    var listA = mutableListOf<Int?>(1,2,3,4)
    var listB = mutableListOf<Int?>()
    listA.add(3)
    listA.add(4)
    listB.add(1)
    listB.add(3)
    listB = listA
    listB.clear()
    listB.add(100)
    listA.add(null)
    println("$listA")
    println("$listB")

}


