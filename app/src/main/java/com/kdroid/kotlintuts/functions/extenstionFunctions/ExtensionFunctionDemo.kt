package com.kdroid.kotlintuts.functions.extenstionFunctions

fun main(args: Array<String>) {
    var a: Int = 2
    var b: Int = 3;
    val greaterVal = a.greaterValue(b)
    println("The max value is $greaterVal")
    val max = a max b
    println("The max value is $max")

    var s1:String = "a"
    var s2:String = "b"
    var s3:String = "c"

     s3= s3.addString(s1,s2)
    println("after the add $s3")

}

//Create a max  functions of Integer class wth help of extension method
 fun Int.greaterValue(other: Int): Int {
    return if (this < other)
        other
    else
        this
}

fun String.addString(s1:String,s2:String):String{
    return this+s1+s2
}

infix fun Int.max(other: Int): Int {
    return if (this < other)
        other
    else
        this
}

