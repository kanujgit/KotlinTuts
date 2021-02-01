package com.kdroid.kotlintuts.range

import androidx.core.util.rangeTo

fun main(args: Array<String>) {

    //this range contain 1,2,3,4
    var r1 =1..4

    //this range contain 4,3,2,1
    var r2 =4 downTo 1

    //this range contain 4,2
    var r3 =4 downTo 1 step 2

    var r4= "a".."z"

    var isPresent = "c" in r4
  //  print(isPresent)

    // 10,9,8,,,,
    var downTO  = 10.downTo(1)

    // 10,9,8,,,,
    var upTO  = 1. rangeTo(10)





}