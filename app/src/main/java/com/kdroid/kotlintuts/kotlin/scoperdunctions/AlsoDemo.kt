package com.kdroid.kotlintuts.kotlin.scoperdunctions

fun main(args: Array<String>) {
    /**
     * Scope function: Also
     * Property 1 : Refer to context object by using 'it'
     * Property 2 : Return value is the 'context object'
     *
     */
    val numberList:MutableList<Int>  = mutableListOf(1,2,3)
    // some other code  ...  may be a function call or a program to swap a number

    val updateList = numberList.also {
        println("the list of $it")
        it.add(4)
        println("the list is after add some items $it")
        it.remove(1)
        println("the list is after removal operations $it")
    }

    // both are object point same list
    println("Original list $numberList")
    println("Original list $updateList")


}

class AlsoDemo {
}