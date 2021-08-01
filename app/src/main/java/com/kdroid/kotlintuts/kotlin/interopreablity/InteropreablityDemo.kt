@file:JvmName("MyCustomKotlinFileName")
package com.kdroid.kotlintuts.kotlin.interopreablity

fun main(args: Array<String>) {
    println("print the area of rectangles ${JavaInter.getArea(2,4)}")
}

fun add(a: Int, b: Int): Int {
    return a + b
}


/**  Code looks internally
 * if using file name
 * public class MyCustomKotlinFileName{
 *
 * public class InteroperabilityDemo{
 *  public static void main (String[] args)
 *
 * }
 *
 * public static int add(int a ,int b){
 * return a+b;
 * }
 *
 */