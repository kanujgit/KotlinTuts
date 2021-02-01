package com.kdroid.kotlintuts.dataclass


fun main(args: Array<String>) {
    var user1 =User("anuj",1);
    var user2 =User("anuj",1);
    var userData1 =UserData("anuj",1);
    var userData2 =UserData("anuj",1);
    println(user1)

    //default implementation of toString
    println(userData1)

    if(user1 == user2){
        println("Equal")
    }else{
        println("Not Equal")
    }


    if(userData1 == userData2){
        println("Equal")
    }else{
        println("Not Equal")
    }

    var nreUserData =  userData1.copy(name = "Kdroid",id = 11);
    println(nreUserData)
}

class User(var name:String,var id :Int)

//only  contain of var or val
data class UserData(var name:String,var id :Int)

//wrong
//data class UserDataVar(name:String,id :Int)