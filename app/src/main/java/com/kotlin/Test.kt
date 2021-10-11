package com.kotlin


private class xyx

val myVal by lazy {
    println("Hello")
    "world"
}

fun main(args: Array<String>) {
    println(myVal)
    println(myVal)


//    val testScore = TestScore()
//    testScore.score =10;
//    println(testScore.score)
//    println("score")

}

class TestScore {
    var score: Int = 12
        get() {
            return if (idNotNUll() && score <= 0)
                0
            else
                score
        }

    fun idNotNUll(): Boolean {
        return score != null
    }
}

//    val list = listOf("one", "two", "three", "four")
//    var list1 = list
//    println(list1)
//    println(list1)
//    println(list)
//
//
//    var x = lazy { 20 }


//}

class Employee(val name: String) {

    fun printF(a: String) {
        print(a)
    }
}



