package com.hari.kotlinCourse.basics.classes

data class customerKotlin(var id : Int, var name : String, var email : String){
    override fun toString(): String {
        return "{id : $id, name : $name }"
    }
}

fun main(args: Array<String>) {

    val customer1 = customerKotlin(1, "hari", "mail@hari.com")

    println(customer1)

}