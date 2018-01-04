package com.hari.kotlinCourse.basics.functions

fun main(args: Array<String>) {

    outisidefunction()



}


fun outisidefunction(){

    for (number in 1..10){

    unaryOperation(20, { x: Int-> x* number})
    }
}



fun unaryOperation(i: Int, any: Any) {}

