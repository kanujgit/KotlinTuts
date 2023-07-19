package com.kotlin

fun main(args: Array<String>) {
      var user1 =User("anuj",1);
      var user2 =User("anuj",1);


      if(user1 == user2){
            println("Equal")
          }else{
            println("Not Equal")
          }
//output : Equal

}


class User(var name:String,var id :Int)


//only contain of var or val
data class UserData(var name:String,var id :Int)


//

////only contain of var or val