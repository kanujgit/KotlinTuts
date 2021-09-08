package com.kdroid.kotlintuts.kotlin


fun main(args: Array<String>) {

    val emp1 = Employee("a")
    val emp2 = Employee("a")
    println(emp1 == emp2)      //false
    println(emp1.equals(emp2)) //false
    println(emp1 === emp2)     //false
}

data class Employee(val name: String) {

}



