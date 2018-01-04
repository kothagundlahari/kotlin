package com.hari.kotlinCourse.basics.inheritance

interface Interface1{
    fun funA(){
        println("this is in the interface1")
    }
}


interface Interface2{
    fun funA(){
        println("this is in the interface2")
    }
}

class inter1andinter2 : Interface1, Interface2{
    override fun funA() {
        println("This is in the inter1andinter2")
    }

}

fun main(args: Array<String>) {

   val c = inter1andinter2()
    c.funA()

}
