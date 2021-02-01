package com.kdroid.kotlintuts.`class`


fun main(args: Array<String>) {
    var student  = ClassDemo("anuj",10)
    //student.name="Anuj"

    println("Student has got id ${student.id}")

}
class ClassDemo (var name: String) {
//    var  name:String="dummy"
    var id:Int=-1

    init {
        println("Name got  ${name} and id is $id")
    }

    //primary cons contain own body
//    can't declare the property of secondary cons(var and val)
    constructor(name: String,id:Int): this(name){
        //body
        //the body of the secondary cons is called after the init block
        this.id = id
    }
}