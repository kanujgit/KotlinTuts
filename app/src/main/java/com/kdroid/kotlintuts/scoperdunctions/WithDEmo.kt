package com.kdroid.kotlintuts.scoperdunctions

fun main(args: Array<String>) {

    /**
     * [Scope] function [with]
     * Property 1: Refer to context object by usnig 'this'
     * Property 2: The return value is the 'lambda result'
     */
    var person = Person()
    println(person.age)
    println(person.name)
    //using 'with'
     val  ageAfter:Int = with(person){
        println("using with")
        println(age)
        println(name)
         age+1
    }
    println("age is $ageAfter")

}
class Person{
    var name:String ="anuj"
    var age:Int =10
}



