package com.kdroid.kotlintuts.kotlin.functions.tailrec

import java.math.BigInteger

//find fab index number
fun main(args: Array<String>) {
    //fibonacci series 0,1,1,2,,3,5,8,13,21,34......
    println(getFibonacciNumber(10000, BigInteger("0"),BigInteger("1")))
}

tailrec fun getFibonacciNumber(n:Int, a:BigInteger, b:BigInteger):BigInteger{

    if(n==0){
        return b;
    }else{
        print(" $a ")
        return getFibonacciNumber(n-1,a+b,a);
    }
}