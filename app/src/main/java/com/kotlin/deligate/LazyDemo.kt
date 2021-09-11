package com.kotlin.deligate

import kotlin.properties.Delegates

class LazyDemo {

    var arr = intArrayOf(1,2,3)
    init {
        println("Lazy heavy initialization")
    }
}

class Student {
    val heavy by lazy { LazyDemo() }

    var marks: Int by Delegates.observable(50) { property, oldValue, newValue ->
        println("Old value: $oldValue")
        println("new value: $newValue")
    }

    var age: Int by Delegates.vetoable(14) { property, oldValue, newValue ->
        println("Old value: $oldValue")
        println("new value: $newValue")
        newValue >= 14
    }
}

fun main(args: Array<String>) {
    val student = Student()
    // use of lazy
        student.heavy

    // use of observable
   // student.marks = 55
//    println("student marks ${student.marks}")
//    student.marks = 65
//    println("student marks ${student.marks}")

    // use of vetoable
//    student.age = 10
//    println("student age ${student.age}")
//    student.age = 15
//    println("student age ${student.age}")

}