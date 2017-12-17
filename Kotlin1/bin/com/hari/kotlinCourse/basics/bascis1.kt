package com.hari.kotlinCourse.basics

fun main(args: Array<String>) {
    val msg = "hari"
    println(msg)


    // Numbers

    val intVal = 10
    println("The integer value is $intVal")

    val longVal: Long = intVal.toLong()
    println("The LongVal is $longVal")


    val charVal = 'a'
    println("the character value is $charVal")

    val stringVal = "This is some stupid text"
    println("The lenght of the string is ${stringVal.length}")

}