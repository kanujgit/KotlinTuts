package com.kotlin.lambdaHigerOrder

fun main(args: Array<String>) {
    var program = Program();

    var myLambda: (Int) -> Unit = { s: Int -> println(s) }    // lambda expression as a functions
    program.addTwoNumber(3, 2,myLambda);
    higherOrderDemo("anuj", { s:String -> println(s) })

}

fun higherOrderDemo(s:String, call: (String) ->Unit){
    call(s)
}

class Program {
    fun addTwoNumber(a: Int, b: Int, myLambda: (Int) -> Unit) {  //Higher level functions with lambda
        val sum = a + b
        myLambda(sum)  // println(sum)
    }
}