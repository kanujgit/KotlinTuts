package com.kotlin.programming

fun List<Long>.hasPairOfSum(sum: Long): Boolean {
    this.forEach { first ->
        forEach { second ->
            if (first + second == sum) return true
        }
    }
    return false
}

fun List<Long>.hasPairOfSum2(sum: Long): Boolean =
//    forEachIndexed{ i,first ->
//        forEachIndexed { j,second ->
//            if (i!=j && first + second == sum) return true
//        }
//    }
//    return false
    indices.any { i ->
        indices.any { j ->
            i != j && this[i] + this[j] == sum
        }
    }


fun main(args: Array<String>) {
    val numbers = listOf<Long>(1L, 2, 3, 4, 11)

    println(numbers.hasPairOfSum2(12))
}