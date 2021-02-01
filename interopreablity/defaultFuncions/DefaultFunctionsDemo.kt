package com.kdroid.kotlintuts.interopreablity.defaultFuncions

fun main(args: Array<String>) {
    var res = findVolume(12,12,)
    println("Volume is $res")
}
@JvmOverloads
fun findVolume(length:Int,width:Int,height:Int =10):Int{
    return length*width*height
}