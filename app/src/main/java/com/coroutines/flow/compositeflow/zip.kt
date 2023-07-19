package com.coroutines.flow.compositeflow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        //zip()
        //combineOperator()
       // catchException()
    }
}

suspend fun zip() {
    val number = listOf(1, 2, 3, 4, 5).asFlow()
    val numberTwo = listOf(1, 2, 3, 4, 5).asFlow()
    number.zip(numberTwo) { item1, item2 ->
        "addition od $item1 and $item2 is = ${item1.plus(item2)}"
    }.collect {
        println(it)
    }
}
suspend fun combineOperator(){
    val number = (1..4).asFlow().onEach { delay(300L) }
    val values = flowOf("1","2","3","4").onEach { delay(400L) }
    number.combine(values){a,b -> "$a and $b"}
        .collect { println(it) }
}

suspend fun catchException(){
    (1..3).asFlow().onEach { check(it != 2) }
        .catch { println("caught exception") }
        .collect { println(it) }


}