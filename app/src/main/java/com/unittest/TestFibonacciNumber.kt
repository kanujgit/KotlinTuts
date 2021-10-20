package com.unittest

fun main(args: Array<String>) {
    println(TestFibonacciNumber.fib(10))
}

object TestFibonacciNumber {

    fun fib(n: Int): Long {
        if (n == 0 || n == 1) {
            return n.toLong()
        }
        var a = 0L
        var b = 1L
        var c = 1L
        (1..n - 2).forEach { _ ->
            c = a + b
            a = b
            b = c
            print("$c ")
        }
        return c
    }
}