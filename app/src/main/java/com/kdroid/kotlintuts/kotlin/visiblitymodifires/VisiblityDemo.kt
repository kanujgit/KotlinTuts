package com.kdroid.kotlintuts.kotlin.visiblitymodifires

fun main(args: Array<String>) {

}

open class Person {
    //super class
    private val a = 1;
    protected val b = 0
    internal val c = 3
    val d = 10
}

class Demo : Person() {//derived class

    //a is not visible
    //b,c is visible
    //d is public ,so it is visible
    fun test() {
        println("$d $c $b ")
    }
}

class Test {
    fun testing() {
        var person = Person();
        println(person.c)
        //c d visible
        //a b is not visible (They are internal and public in nature)
    }
}