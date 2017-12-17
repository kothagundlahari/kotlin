package com.hari.kotlinCourse.basics.functions

fun hello(){
    println("Hello hari")
}

fun throwExeption() :Nothing {
    throw Exception("This is an exeption")

}

fun sum(x:Int , y:Int) = x + y

fun varArgs(vararg name: String){
    for (nam in name){
        println(nam)
    }
}


fun defParmeteres(name:String, email: String = "hari.k.krishna4@gmail.com", phone:String ){

    println("name : $name - email: $email  phone: $phone");

}

fun main(args: Array<String>) {

    val hstr = hello();
    println(hstr)
    hello()

    val add = sum(2,3)
    println(add)

//    throwExeption()

    defParmeteres("hari", phone = "123456789");

    println("hari")

    varArgs("1","2","3")


}