package com.bngs0.kotlinoop

class SuperMusician(name: String?, instrument: String?, age: Int?) :
    Musician(name, instrument, age) {

    fun sing(){
        println("${name} Singing: Seninleyim")
    }
}