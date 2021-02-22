package com.kdroid.kotlintuts.kotlin.nullsafety

fun main(args: Array<String>) {

    val name: String? ="null";

    //1: Safe call(?.)
    //return the length is name is not null else return null
    //Use it if you don't mind getting null values
    println("the length of name is ${name?.length}")

    //2: Safe call with let {?.let}
        //It execute the block ONLY IF is NOT NULL
    name?.let { println("The length of name is with using let ${name.length}") }


    //3: Elvis Operator (?.)
    // when we have nullable reference 'name', we can say " is name is not null, use it
    // other wise use the not null values

    val len = if(name!=null)
        name.length
    else
        -1

    println("length is $len")

    ///////////////// or//////////////////////////////////
    val length = name?.length?:-1
    println("length using elvis ops is $length")

    //4 : Non Null assertion operator (  !!  )
       //Use it when you are sure the value is NOT NULL
    // throws the NullPointerException if the value is found to be NULL

    println("the length of name is  by using of Null assertions operator : ${name!!.length}")



}