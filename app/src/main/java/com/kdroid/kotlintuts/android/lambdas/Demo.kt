package com.kdroid.kotlintuts.android.lambdas


fun main(args: Array<String>) {
    // 1
    val lambda1: () -> Unit = { println("Hello, world") }
    // 2
    val lambda2 = { println("Hello, world") }
    // 3
    val lambda3 = { print("as") }
    // 4
    Lambda().l4(1, 2)
    Lambda().l2("anuj")


}

class Lambda {

    val l4: (Int, Int) -> Int = { param1: Int, param2: Int ->
        println(param1)
        println(param2)
        println(param1 + param2)
        param1 + param2
    }


    val l2: (String) -> Unit = { name -> println(name) }
}
