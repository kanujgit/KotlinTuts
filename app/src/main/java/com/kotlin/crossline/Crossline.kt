package com.kotlin.crossline

fun main() {
    guide()
}

fun guide() {
    print("guide start")
    teach {
        print("teach")
        return@teach
    }
    print("guide end")
}

inline fun teach(abc: () -> Unit) {
    abc()
}