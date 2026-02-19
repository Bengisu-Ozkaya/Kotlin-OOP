package com.bngs0.kotlinoop

interface Instrument {
    //javada info'nun içini dolduramam override etmem gerekiyordu
    //Kotlinde info'nun içini doldurabiliyorum

    fun info(){
        println("instrument info")
    }
}