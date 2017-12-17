package com.hari.kotlinCourse.basics.classes

object Global{
	val PI = 3.14
}

fun main(args: Array<String>){
	println(Global.PI)
	val localObject = object{
		val PI = 3.2 
	}
	
	println(localObject.PI)
}

