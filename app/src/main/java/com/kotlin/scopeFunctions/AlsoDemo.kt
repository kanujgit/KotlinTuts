package com.kotlin.scopeFunctions

fun main(args: Array<String>) {
    /**
     * Scope function: Also
     * Property 1 : Refer to context object by using 'it'
     * Property 2 : Return value is the 'context object'
     *
     */
    val numberList:MutableList<Int>  = mutableListOf(1,2,3)
    // some other code  ...  may be a function call or a program to swap a number

    val updateList = numberList.also { list ->
        println("the list of $list")
        list.add(4)
        println("the list is after add some items $list")
        list.remove(1).also {
        list.add(5)
        }
        println("the list is after removal operations $list")
    }

    // both are object point same list
    println("Original list $numberList")
    println("Original list $updateList")

    val str1: String? = "Hello"
    val result = str1?.let { println(it.length) } // result is "HELLO"

    val str: String? = "Hello"
    val res = str?.also { println(it.length) } // prints "5" (the length of "Hello")


}

class AlsoDemo