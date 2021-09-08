package com.kotlin.coroutines.channel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
//        val channel = produce<Int> {
//            for (i in 1..10) {
//                send(i)
//            }
//        }
//
//        for (u in 1..10) {
//            println(channel.receive())
//        }

//        for (x in produceNumber()) {
//            println(x)
//        }
        produceNumber().consumeEach {
            println(it)
        }
    }
}

fun CoroutineScope.produceNumber() = produce {
    for (x in 1..10) {
        send(x)
    }
}
