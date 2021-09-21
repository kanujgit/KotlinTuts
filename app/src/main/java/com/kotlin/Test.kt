package com.kotlin


private class xyx

val myVal by lazy {
    println("Hello")
    "wol"
    "world"
}
fun main(args: Array<String>) {

    println(myVal)
    println(myVal)
//    val emp1 = Employee("a")
//    val emp2 = Employee("a")
//    println(emp1 == emp2)      //false
//    println(emp1.equals(emp2)) //false
//    println(emp1 === emp2)     //false

    //Employee("a").printF("a")

}


//    val list = listOf("one", "two", "three", "four")
//    var list1 = list
//    println(list1)
//    println(list1)
//    println(list)
//
//
//    var x = lazy { 20 }


//}

class Employee(val name: String) {

    fun printF(a: String) {
        print(a)
    }
}



