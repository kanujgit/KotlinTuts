package com.kdroid.kotlintuts.abstract_interface

fun main(args: Array<String>) {

}
abstract  class Person{          // can't create instance

    abstract var name:String     // abstract properties are "open" by default
    abstract fun eat()
    open fun getHeight(){}
}

class  Indian : Person(){
    //need to defined
    override var name:String =""
    override fun eat() {
    }
}