package com.kotlin


fun main(args: Array<String>) {

    val emp1 = Employee("a")
    val emp2 = Employee("a")
    println(emp1 == emp2)      //false
    println(emp1.equals(emp2)) //false
    println(emp1 === emp2)     //false

    Employee("a").printF("a")
}

 class Employee(val name: String) {

     fun printF( a:String){
         print(a)
     }
}



