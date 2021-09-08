package com.kotlin.nullsafety


fun main(args: Array<String>) {

    // use only with mutable datatype with var
    // use only only non-nullable data-type
    // must be initialized before use it


    var  lateObjct = LetInitDemo()
    lateObjct.name ="anuj"
    println(lateObjct.name)

}
class LetInitDemo {

    lateinit var name:String

}
