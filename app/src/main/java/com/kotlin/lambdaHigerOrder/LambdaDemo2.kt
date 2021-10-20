package com.kotlin.lambdaHigerOrder

fun main(args: Array<String>) {
    var program = Program2()


//    val myLambda : (Int,Int) -> Int={x,y ->x+y}
//    program.addTwoNumber(2,2,myLambda)
    program.addTwoNumber(2, 2) { x, y -> x + y }
    //var result: Int = 0
    //program.addTwoNumber(2, 2) { x, y -> result = x + y }

    //println(result)

    program.addTwoNumber(1, 1) { item1, item2 -> item1 + item2 }

}

class Program2 {
    fun addTwoNumber(
        a: Int,
        b: Int,
        myLambda: (Int, Int) -> Int
    ) {  //Higher level functions with lambda
        val result = myLambda(a, b)
        println(result)
    }
}


/*
* class Program2 {
    fun addTwoNumber(a: Int, b: Int, myLambda: (Int,Int) -> Int) {  //Higher level functions with lambda
     var result = myLambda(a,b)
        println(result)
    }
}
* */