package com.kdroid.kotlintuts.kotlin.abstract_interface

fun main(args: Array<String>) {

    var myBtn = Button()
    myBtn.onClick();
    myBtn.onTouch()


}

interface MyInterfaceListener {          // can't create instance

    var name: String

    //normal method
    fun onClick() {                     //Normal methods are public and open by default NOT FINAL
        println("on Click in Interface")
    }

    //abstract
    fun onTouch()                      //Method in interface are abstract by default
}

class Button : MyInterfaceListener {
    //body
    override fun onTouch() {
        println("On touch ")
    }

    override fun onClick() {
        //defined your code
        super.onClick()
        println("on Click")
    }

    override var name: String = "dummy"

}