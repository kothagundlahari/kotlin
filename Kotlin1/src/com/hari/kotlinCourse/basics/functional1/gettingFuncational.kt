package com.hari.kotlinCourse.basics.functional1

fun Aoperation(x: Int, y: Int, op:(Int, Int)->Int): Int{
   return op(x,y)

}

fun sum(x:Int, y:Int) = x+y

fun main(args: Array<String>) {
    val f: Int = Aoperation(1,2, ::sum)

    println(f)

}