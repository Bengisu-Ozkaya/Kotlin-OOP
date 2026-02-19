package com.bngs0.kotlinoop

class Guitar : HouseDecor, Instrument {
    override var roomName: String
        get() = "Living Room" // override etmiş oluyorum burada
        set(value) {}

    var brand : String? = null //marka
    var electro : Boolean? = null

}