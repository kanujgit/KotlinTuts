package com.kdroid.kotlintuts.lambdaHigerOrder

fun main(args: Array<String>) {


    var person = ProgramItApply()
    person.id =10
    person.name="anuj"
    with(person){                         // assign all name once
        name ="kdroid"
        id=11
    }
    person.apply {
        name="apply"
        id=11
    }.startPlay()  //we can call methods name also

}

class ProgramItApply {

    var name: String = ""
    var id: Int = -1

    fun startPlay(){
        println("Playing")
    }


}