package com.kdroid.kotlintuts.kotlin.scoperdunctions

fun main(args: Array<String>) {

    var apply = ApplyDemo().apply {
        applName = "update"
        id = 11
    }
    with(apply){
        println(apply)
        println(applName)
    }
}

class ApplyDemo {
    var applName: String = "apply"
    var id: Int = 10
}
