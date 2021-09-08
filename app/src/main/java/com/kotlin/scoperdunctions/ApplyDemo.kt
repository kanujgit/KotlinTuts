package com.kotlin.scoperdunctions

// initial configuration of object
//you can use also for initial
// but you can use it
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
