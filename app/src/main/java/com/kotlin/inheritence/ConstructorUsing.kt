package com.kotlin.inheritence

fun main(args: Array<String>) {
    var dog = Dog("Black", "pug")
}

open class Animal {
    init {
        println("From Animal init")
    }
}

class Dog(color: String, var breed: String) : Animal() {
    init {
        println("From dog init : $color and $breed")
    }
}