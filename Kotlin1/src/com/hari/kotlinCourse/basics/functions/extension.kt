package com.hari.kotlinCourse.basics.functions

fun String.hello(){
   println("It's me ")
}

class Customer{
    fun makePreffered(){
        println("This is in the Customer class ")
    }
}

fun Customer.makePreffered(){
    println("This is extension class ")
}

fun main(args: Array<String>) {
    "Krishna".hello()

    val customer = Customer()
    customer.makePreffered()

    val insta : BaseClass = InheritedClass()

    insta.extension()
}


open class BaseClass
class InheritedClass : BaseClass()

fun BaseClass.extension(){
    println("This is in the BaseClass")
}

fun InheritedClass.extension(){
    println("This is in the inheritedclass")
}