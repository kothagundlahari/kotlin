package com.hari.kotlinCourse.basics.functional1

import com.hari.kotlinCourse.basics.inheritance.customer

class repositoryImpl<T> : repository<T> {
    override fun getId(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


fun main(args: Array<String>) {
    val cust = repositoryImpl<customer>()

    cust.getAll()
    cust.getId(5)
}


