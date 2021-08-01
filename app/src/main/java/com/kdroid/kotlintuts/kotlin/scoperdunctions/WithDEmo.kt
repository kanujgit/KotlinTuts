package com.kdroid.kotlintuts.kotlin.scoperdunctions


/**
 * +-------------------------------------------+
 * Function | Context Object |  Return Value   |
 *+--------------------------------------------+
 * let            it            lambda result  |
 * run            this          lambda result  |
 * with           this          lambda result  |
 * apply          this          Context Object |
 * also           it            Context Object |
 *+--------------------------------------------+
 */

//we use with when we have lot of property   and function
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
         person.age= 10
         name= "anuj kumar"
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



