package com.kotlin.dataclass

data class DataclassDemo(val id: String, val name: String) {

   // fun getFullName() = "$id and $name"
}



fun main(args: Array<String>) {
    var dataclassDemo1 = DataclassDemo("1", "w")
    var dataclassDemo2 = DataclassDemo("1", "w")
    var dataclassDemo3 = DataclassDemo("1", "a")

    println(dataclassDemo1 == dataclassDemo2)

    println(dataclassDemo1 === dataclassDemo2)

    println(dataclassDemo1.equals(dataclassDemo2))


    // component n function
    println(dataclassDemo1.component1())
    println(dataclassDemo1.component2())

    val (id,name) =dataclassDemo1

}