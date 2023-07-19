package com


class DataPrintDemo() {
    val data: String = "anuj"

    override fun toString(): String {
        return data.toString()
    }


}

open class SuperClass {
    //companion object {
    open fun sayHello() {
        println("Hello from SuperClass")
    }
    //}
}

class SubClass : SuperClass() {

}

data class Person(var name: String, var address: String, var rsi: Int)

fun main() {
    val list = mutableListOf<Person>()
    list.add(Person("Anuj", "12", -132))
    list.add(Person("Anuj", "13", -100))
    list.add(Person("An", "12", -13))
    list.add(Person("Anuj", "11", -12))

    filteredDevice(list)

}

fun filteredDevice(list: MutableList<Person>) {
    var foundDevices: MutableList<Person> = mutableListOf()
    var i = 0
    while (i <= list.size) {
        var device: Person = list.get(i)
        if (foundDevices.isEmpty() || !foundDevices.any { it.address.contains(device.address) }) {
            foundDevices.add(device)
            foundDevices.sortByDescending { it.rsi }
            println("Found device: $device and $foundDevices")
        }
        i++
    }


}





