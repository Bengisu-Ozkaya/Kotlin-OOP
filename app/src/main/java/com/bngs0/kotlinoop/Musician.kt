package com.bngs0.kotlinoop

open class Musician(name: String?, instrument: String?, age: Int?) { //sınıf direkt constuctorlu (primary consturctor)
     var name : String? = name
        private set //adı set edemyiz, sadece değerine ulaşabiliriz
        get

    private var instrument: String? = instrument
        private set
        get

    var age : Int? = age

    private val bandName : String = "BengiBengi"

    fun returnBandName(password:String): String {
        if (password == "bngs"){
            return bandName
        }
        return "Wrong Password!"
    }
}