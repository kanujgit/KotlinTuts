package com.kdroid.kotlintuts.codingchallanges.geeks.recursion

import java.math.BigInteger

fun main(args: Array<String>) {
    val number = 140L
    print(getFactorialNumber(number, 1))
}

tailrec fun getFactorialNumber(n: Long, accu: Long = 1): Long {
    var soFar = accu * n
    return if (n <=1) {
        soFar
    } else {
        getFactorialNumber(n - 1, soFar)
    }
}


tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n == 0) {
        return b;
    } else {
        print(" $a ")
        return getFibonacciNumber(n - 1, a + b, a);
    }
}