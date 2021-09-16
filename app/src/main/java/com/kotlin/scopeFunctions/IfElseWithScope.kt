package com.kotlin.scopeFunctions

fun main(args: Array<String>) {
    var str = null

    str?.let {
        println(str)
    } ?: run {
        print(str)
    }
}