package com.kdroid.kotlintuts.kotlin.sealed


//like as abstract class
//

sealed class Data {
    data class Success(val data: String)
}

class SealedDemo {
}