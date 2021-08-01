package com.kdroid.kotlintuts.kotlin.inheritence

fun main(args: Array<String>) {

    var bank :Bank = Bank();
    bank.credit()
    var sbi:SBI = SBI();
    //sbi.fd()
//    sbi.credit()
//    sbi.debit()
    println(sbi.isPrivate)

}

open class Bank{

    open var isPrivate =false;
   open fun debit(){
        println("Default debit functions")
    }
    fun credit(){
        println("Default credit functions")
    }
}

class SBI : Bank() {
    fun fd(){
        println("SBi FD")
    }


    //override member var also
    override var isPrivate: Boolean = true


    override fun debit() {
        // execute parent method
        super.debit()
        //execute child class method
        println("SBi debit")
    }
}
class HDFC : Bank(){

    fun PF(){
        println("PNB PF")
    }
}