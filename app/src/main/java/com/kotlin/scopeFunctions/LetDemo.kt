package com.kotlin.scopeFunctions

/**
 * +-------------------------------------------+
 * Function | Context Object |  Return Value   |
 *+--------------------------------------------+
 * let            it            lambda result  |
 * run            this          lambda result  |
 * with           this          lambda result  |
 * apply          this          Context Object |
 * also           it            Context Object |
 *+--------------------------------------------+
 */

/**
 * 'let'
 * Property 1: Refer to context  object by using 'it'
 * Property 2: Return value is the 'lambda result'
 * null safety
 */
class LetDemo

fun main(args: Array<String>) {
    performLetOperation()
}

private fun performLetOperation() {
    val person = Person().let {
        "The name of the Person is: ${it.name}"
    }
    print(person)
}
