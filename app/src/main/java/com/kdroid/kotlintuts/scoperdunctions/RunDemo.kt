package com.kdroid.kotlintuts.scoperdunctions


/**
 * Scope functions : 'run'
 * Property 1: Refer to context object by using 'this'
 * Property 2: The return value is the 'lambda'
 * Combinations of [with] and [let] functions
 */
class RunDemo {
    var name:String ="anuj"
    var age:Int =10
}

fun main(args: Array<String>) {

    var person: Person?=Person()

    var bio  = person?.run {
        println(name)
        println(age)
    }
    println(bio)
}