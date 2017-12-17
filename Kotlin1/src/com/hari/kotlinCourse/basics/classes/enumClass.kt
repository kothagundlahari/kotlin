package com.hari.kotlinCourse.basics.classes

enum class Priority(val values:Int){
	MINOR(-1),
	NORMAL(0),
	MAJOR(1),
	CRITICAL(2)
}

fun main(args:Array<String>){
	val priority = Priority.NORMAL
	println(priority)
	println(priority.values)
	println(priority.ordinal)
	
	
	
	
}
