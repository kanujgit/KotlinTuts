package com.kotlin.sigleton


fun main(args: Array<String>) {

    Singleton.singleton =10
    Singleton.getSingleton()
    Singleton.myMethods()
}

open class SuperClass{
    open fun myMethods(){
        println("my methods")
    }
}
object Singleton : SuperClass(){
    var singleton: Int = -1

    override fun myMethods() {
        super.myMethods()
        println("child my methods")
    }

    fun getSingleton() {
        println("get singleton")
    }

    init {
        println("init block execute")
    }
}

