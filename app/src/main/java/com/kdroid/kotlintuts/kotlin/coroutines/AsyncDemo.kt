package com.kdroid.kotlintuts.kotlin.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking


@ExperimentalStdlibApi
fun main() = runBlocking {

    // normal list output
    val list = foo()
    for (x in list) println("list demo $x ")

    // channel example
    val channelDemo = channelFoo()
    for (x in channelDemo) println("Channel demo $x")

    /// flow example
    val flowExample = flowFoo()
    flowExample.collect { item -> println("flow demo $item") }

}

@ExperimentalStdlibApi
suspend fun foo(): List<String> = buildList {
    add(compute("A"))
    add(compute("B"))
    add(compute("C"))
}

suspend fun compute(a: String): String {
    delay((0..1000).random().toLong())
    return a
}


/**
 * Channel Demo
 * Channel are hot
 */
fun CoroutineScope.channelFoo(): ReceiveChannel<String> = produce<String> {
    send(compute("A"))
    send(compute("B"))
    send(compute("C"))
}


/**
 * Flow are cold they are not waiting for output
 * If I don't collect  flow  because of stuck some condition or got exception, then nothing them happen
 * Flow are declarative :  * mean it happens when foo are ready to  collect
 */
fun flowFoo(): Flow<String> = flow<String> {
    emit(compute("A"))
    emit(compute("B"))
    emit(compute("C"))
}
