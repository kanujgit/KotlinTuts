package com.kdroid.kotlintuts.kotlin.Enum

// can'a add abstract class
interface DoColor {
    fun doColor()
}

enum class Color(val colorName: String) : DoColor {
    RED("Red") {
        override fun doColor() {
            println("Color is red")
        }
    },
    GREEN("Green") {
        override fun doColor() {
            println("Color is green")
        }
    },

    BLACK("Black") {
        override fun doColor() {
            println("Color is black")
        }
    };

}

fun main(args: Array<String>) {
    //Color.values().forEach { println(it) }

//    val color = Color.RED
//
//    when(color){
//        Color.RED -> println("Color is red")
//        Color.BLACK -> println("Color is black")
//        Color.GREEN -> println("Color is green")
//
//    }

    println(Color.RED.colorName)
    Color.RED.doColor()
}

class Enum {
}