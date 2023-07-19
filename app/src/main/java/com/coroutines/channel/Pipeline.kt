package com.coroutines.channel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

class Pipeline {

}

fun main() {
    runBlocking {
        val number = produceNumber()
        val squareNumber = squareNumber(number)
        for (i in 1..5) {
            println(squareNumber.receive())
        }
        println("Done")
        number.cancel()
        squareNumber.cancel()
    }
}

fun CoroutineScope.produceNUmber() = produce {
    var x = 1
    while (true) {
        send(x++)
    }
}

fun CoroutineScope.squareNumber(number: ReceiveChannel<Int>) = produce {
    for (i in number) {
        send(i * i)
    }
}