package com.kdroid.kotlintuts.kotlin.sigleton

fun main(args: Array<String>) {

//    Singleton.singleton = 10
//    Singleton.getSingleton()
//    Singleton.myMethods()
    //CompanionDemo.singleton
   CompanionDemo.getSingleton()

}


class CompanionDemo {
    companion object Companion {     /// just like static var
      //  var singleton: Int = -1

        fun getSingleton() {
            println("get static")
        }

    }


}