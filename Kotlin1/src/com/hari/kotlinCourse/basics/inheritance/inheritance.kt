package com.hari.kotlinCourse.basics.inheritance


  open class customer(){
      open fun validate(){
          println("I am in customer")
      }
  }

class person() : customer() {

    override fun validate(){
        println("I am in person")
    }

}


fun main(args: Array<String>) {

    val p1 = person()

    p1.validate()

}

