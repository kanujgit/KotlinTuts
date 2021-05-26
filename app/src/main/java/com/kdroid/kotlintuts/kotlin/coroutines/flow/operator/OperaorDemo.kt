package com.kdroid.kotlintuts.kotlin.coroutines.flow.operator

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.coroutineContext

fun main() {
    runBlocking {
        //mapOperator()
        //filterOperator()
        ///transformOperator()
//        takeOperator()
        //reduceOperatorByFactorial()
        flowOn()
    }

}

suspend fun mapOperator() {
    (1..10).asFlow()
        .map {
            delay(1000L)
            "mapping $it"
        }
        .collect {
            println(it)
        }
}

suspend fun filterOperator() {
    (1..10).asFlow()
        .filter { it % 2 == 0 }
        .map {
            delay(1000L)
            "mapping $it"
        }
        .collect {
            println(it)
        }
}

suspend fun transformOperator() {
    (1..10).asFlow()
        .filter { it % 2 == 0 }
        .transform {
            emit("emmiting value $it")
        }
        .map {
            delay(1000L)
            "mapping $it"
        }
        .collect {
            println(it)
        }
}

suspend fun takeOperator() {
    (1..10).asFlow()
        .take(2)
        .collect {
            println(it)
        }

}

suspend fun reduceOperatorByFactorial() {
    val size = 100
    val factorial = (1..20).asFlow()
        .reduce { accumulator, value -> accumulator * value }
    println("factorial is $size is $factorial")
}

suspend fun flowOn() {

    (1..10).asFlow().flowOn(Dispatchers.Default)
        .collect { println("$it and ${Thread.currentThread() } and $coroutineContext" ) }
}
