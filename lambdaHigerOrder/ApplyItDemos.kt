package com.kdroid.kotlintuts.lambdaHigerOrder

fun main(args: Array<String>) {

    val program = ProgramIt();
    //it will be follow only one parameter
    program.reverseAndDisplay("hello") { it.reversed() }

}

class ProgramIt {
    fun reverseAndDisplay(
        str: String,
        myLambda: (String) -> String
    ) {    // make high level functions
        var res = myLambda(str)   // str.reversed()  ----->  "hello".reverse()
        println(res)
    }
}