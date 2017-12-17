package com.hari.kotlinCourse.basics.tidbits

open class Person{

}

class Employee: Person(){
    fun vacationDays(days: Int){
        if(days < 60){
            println("You need more vacation")
        }
    }


}

class Contractor: Person(){

}

fun hasVacations(obj : Person){
    if (obj is Employee){
        obj.vacationDays(20)
    }else{

    }

}

fun main(args: Array<String>){

    val str = Int as? String

    println(str?.length)


}


