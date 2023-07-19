package com.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

var funtionCalll = 0

fun main() {
    GlobalScope.launch { completeMessage() }
    GlobalScope.launch { improvedMessage() }
    print("Hello ")
    Thread.sleep(2000L)
    println("function call: $funtionCalll ")
}

suspend fun completeMessage() {
    delay(500L)
    println("World")
    funtionCalll++
}

suspend fun improvedMessage() {
    delay(1000L)
    println("Suspend function are cool")
    funtionCalll++
}