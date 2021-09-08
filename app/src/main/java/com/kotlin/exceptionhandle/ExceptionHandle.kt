package com.kotlin.exceptionhandle


/**
 * Exception is an abnormal thing while executing our code program  that interrupt normal flow that called and  exception
 * or
 * issues which occur on run time
 * NullPointerException,ArrayIndexOutOfBoundException,IoException
 *
 * // any class contain 3 things
 * // message
 * // stacktrace
 * // optional call
 *
 *   Throwable
 *   Exception
 *   All other Exception that are Predefine
 *
 */

class IllegalVoterException(message: String) : Exception(message)
class ExceptionHandle {


}

fun main(args: Array<String>)  {
    val a = 10
    val b = 0
    var c = try {
        println("inside class")
        if(a>b){
            throw IllegalVoterException("sd")
        }else{
            throw IllegalVoterException("sd")
        }
    } catch (e: IllegalVoterException) {
        println("sd")

    } finally {
        println("finally")
    }
    println("finally $c")
}