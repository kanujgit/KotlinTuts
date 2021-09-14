package com.java.enumdemo

fun main(args: Array<String>) {

}

// sealed can have generic type class
//sealed class can hold instance specific data( we can pass generic type data in sealed)
//inside sealed class we can pass any type of class like data , object and normal classes and also pass data in const
//4:Sealed classes limit inheritance.
sealed class SealedCar {
    object BMD : SealedCar()
    object Audi : SealedCar()
    object Mercedes : SealedCar()
}

//enum dose not have generic class concept
//enum has only fix value(mean hard coded)
// by default it gives 0,1,2
//4:Enum classes limit instantiation.
enum class EnumCar {
    BMD,
    AUDI,
    MERCEDES
}