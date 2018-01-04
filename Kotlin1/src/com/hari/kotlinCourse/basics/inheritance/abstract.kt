package com.hari.kotlinCourse.basics.inheritance

abstract class personIn{
    fun hari(){
        println("I am in personIn")
    }

    fun hari2(){}

    val flag = true;
}


class personOut: personIn() {

}

fun main(args: Array<String>) {
    val pe = personOut()

    println(pe.flag)
    pe.hari()
}