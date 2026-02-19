package com.bngs0.kotlinoop

class Cat : Animal() {
    fun test(){ // direkt extend aldığı sınıftaki fonksiyonu çağırıyor
        super.sound()
    }

    override fun sound(){
        println("meow")
    }
}