package com.hari.kotlinCourse.basics

fun main(args: Array<String>) {


   /* for(a in 200 downTo 101){
        println(a)

    }*/

    val Cities = listOf("khamam", "hyd")

    for(city in Cities) {
        println(city)
    }

    loop@for(i in 1..100){
        for(j in 1..100){
            if(i%2 == 0){
                break@loop
            }
        }
    }
    }
