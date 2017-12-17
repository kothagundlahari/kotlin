package com.hari.kotlinCourse.basics.tidbits


fun capitalAndPopulation(country: String): Pair<String, Long>{
    return Pair("India", 130000)
}

fun capitalStatePopulation(state : String): Triple<String, String, Long>{
    return Triple("India", "Andhra Pradesh", 13000000)
}
fun main(args: Array<String>) {

//    val pairTest = capitalAndPopulation("india")
//    println(pairTest.first)
//    println(pairTest.second)

    val tripleTest = capitalStatePopulation("india")
//    println(tripleTest.first)
//    println(tripleTest.second)
//    println(tripleTest.third)

    val (country, state, population) = capitalStatePopulation("Andhra Pradesh")

    println(country)
    println(state)
    println(population)

}