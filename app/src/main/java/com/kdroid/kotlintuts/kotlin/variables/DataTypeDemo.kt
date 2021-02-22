package com.kdroid.kotlintuts.kotlin.variables

fun main(args: Array<String>) {

    var myString = "10"
    var myDecimal = 1.0
    var myNumber = 1
    ///print(myString)
    // immutable data type
    val myFinalString ="my final string";
    print(myString)
    display(myFinalString)

    // create object
    var displayObjects =  Display()
    displayObjects.display(myFinalString)

    //print
    //String interpolation
    //print("the name of class ${displayObjects.display("anuj")}")

    //make costrutor
    var display = DisplayValue(myFinalString)
    display.display();
    var age: Int =10

    var a=10
    var b=20
    println("the value of a is $a and value of b is $b and their sum is ${a+b}")
}

//through functions
fun display(name : String){
    println("kotlin method ")
}


//through class
class Display{
    var name : String = ""
    fun display(name : String){
        println("kotlin class")
    }
}