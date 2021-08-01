package com.kdroid.kotlintuts.kotlin

data class Dog(val id: Int, var name: String)

fun main(args: Array<String>) {
//    val dog = Dog(id=2, "anuj")
//    dog.name = "kumar"
//    println(dog)
//    println(Eagle())


}

interface Bird {
    val hasFather: Boolean
        get() = false
}

class Eagle : Bird {
    override val hasFather: Boolean
        get() = true
}

open class ENE{
    open fun open(){
        println("open")
    }
}
open class WALL: ENE() {
   open override fun open() {
        super.open()
    }
}

open class safe : WALL() {
     override fun open() {
        super.open()
    }
}


