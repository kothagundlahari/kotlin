package com.hari.kotlinCourse.basics.functional1

interface repository<T>{
    fun getId(id: Int): T
    fun getAll(): T
}


