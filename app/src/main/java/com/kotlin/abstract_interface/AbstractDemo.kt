package com.kotlin.abstract_interface

fun main(args: Array<String>) {
// Won't print
//    val (first, second, third) = guardLet("Hello", null, "h") { return }
//    println(first)
//    println(second)
//    println(third)
//
    listOf("something", "else", "matters").whenAllNotNull {
        println(it.joinToString(" "))
    } // output "something else matters"

    listOf("som", null, "matters").whenAllNotNull {
        println(it.joinToString(" "))
    } // no output

    listOf("something", null, "matters").whenAnyNotNull {
        println(it.joinToString(" "))
    }

}

fun <T: Any, R: Any> Collection<T?>.whenAllNotNull(block: (List<T>)->R) {
    if (this.all { it != null }) {
        block(this.filterNotNull()) // or do unsafe cast to non null collectino
    }
}

fun <T: Any, R: Any> Collection<T?>.whenAnyNotNull(block: (List<T>)->R) {
    if (this.any { it != null }) {
        block(this.filterNotNull() )
    }
}

fun <T : Any, R : Any> whenAnyNotNull(vararg options: T?, block: (List<T>) -> R) {
    if (options.any { it != null }) {
        block(options.filterNotNull())
    }
}

inline fun <T : Any> ifLet(vararg elements: T?, closure: (List<T>) -> Unit) {
    if (elements.all { it != null }) {
        closure(elements.filterNotNull())
    }
}

abstract class Person {          // can't create instance

    abstract var name: String     // abstract properties are "open" by default
    abstract fun eat()
    open fun getHeight() {}
}

class Indian : Person() {
    //need to defined
    override var name: String = ""
    override fun eat() {
    }
}