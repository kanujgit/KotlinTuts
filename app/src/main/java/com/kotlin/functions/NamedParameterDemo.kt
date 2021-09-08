package com.kotlin.functions


fun main(args: Array<String>) {
    findVolume(height = 10, length = 1, width = 2)
}

fun findVolume(length: Int, width: Int, height: Int = 10): Int {
    println("Height is $height")
    println("width is $width")
    println("length is $length")
    return length * width * height
}