package com.kotlin.scopeFunctions


/**
 * Scope functions : 'run'
 * Property 1: Refer to context object by using 'this'
 * Property 2: The return value is the 'lambda'
 * Combinations of [with] and [let] functions
 */


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

// not define the custom name of obeject
//but in let we define the custom object
class RunDemo {
    var name: String = "anuj"
    var age: Int = 10
}

fun main(args: Array<String>) {

    var person: Person? = Person()

//    var bio = person?.run {
//        println(name)
//        println(age)
//    }
    //println(bio)
    performRunOperation()

}


class PersonClass {
    var name: String = "Abcd"
    var contactNumber: String = "1234567890"
    var address: String = "xyz"
    fun displayInfo() = print(
        "\n Name: $name\n " +
                "Contact Number: $contactNumber\n " +
                "Address: $address"
    )

}

private fun performRunOperation() {
    val person = PersonClass().run {
        name = "Asdf"
        contactNumber = "12"
        return@run "The details of the Person is: ${this.name}"
    }
    print(person)
}
