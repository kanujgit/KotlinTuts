package com.kotlin.constructors

open class SecondaryConstructorDemo() {
    var data: String = ""
    var numberOfData = 0

    init {
        println("SecondaryConstructorDemo init block")
    }
}

class AuthLog {

    init {
        println("init Auth logs")
    }
}

fun main() {
    //val p1 = AuthLog("Bad Password")
}