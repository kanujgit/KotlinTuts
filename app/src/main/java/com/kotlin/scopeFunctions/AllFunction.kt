package com.kotlin.scopeFunctions

data class PersonData(var name: String, var age: Int, var job: String) {

    fun printData() {
        println(this.toString())
    }
}

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

fun main(args: Array<String>) {
    var personData = PersonData("Anuj", 12, "Developer")

    personData.run {
        age = 11
        name = "Kdroid"
        job = "Software Engineer"
        printData()
    }
    with(personData) {
        age+=1
        name= "Anuj".plus(name)
        printData()
    }
    // check null pointer exception
    personData.let {
        personData.name = "anuj"
        personData.printData()
    }

    personData.apply {
        age= 14
        name="kumar".reversed()
        printData()
    }
    personData.also {
        it.name= "anuj"
        it.job="Android Developer"
    }.printData()
}

class AllFunction