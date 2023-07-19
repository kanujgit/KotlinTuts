package com.kotlin.constructors

import java.util.*

class ConstructorDemo(_firstName: String = "UNKNOWN", _age: Int = 0) {
    val firstName: String
    var age: Int
    var count =0


    init {
        firstName = _firstName.capitalize(Locale.ROOT)
        age = _age

        println("init $count")
        println("First Name = $firstName")
        println("Age = $age")
    }

    val secondProperty = "Second property: ${_firstName.length}".also(::println)

    init {
        println("Second initializer block that prints ${_firstName.length}")
    }
}

fun main() {

    println("person3 is instantiated")
    val person3 = ConstructorDemo()

    println("person2 is instantiated")
    val person2 = ConstructorDemo("Jack")



    println("person1 is instantiated")
    val person1 = ConstructorDemo("joe", 25)
}