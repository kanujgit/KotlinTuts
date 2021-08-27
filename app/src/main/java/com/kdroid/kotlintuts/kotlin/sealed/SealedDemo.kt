package com.kdroid.kotlintuts.kotlin.sealed


//like as abstract class
// limited set of value we can use sealed classes
// its an abstract class.
//

sealed class Data {
    data class Success(val data: String) : Data()
    data class Failure(val data: String) : Data()
    object Loading : Data()
}


fun getData(): Data {
    return Data.Failure((100..100).random().toString())
}

fun main(args: Array<String>) {
    val data = getData();
    when (data) {

        is Data.Success -> {
            println("Success")
        }
        is Data.Failure -> {
            println("Failure")
        }
        is Data.Loading -> {
            println("Loading")
        }
    }
}

class SealedDemo {
}