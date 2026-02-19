 package com.bngs0.kotlinoop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.SupervisorJob

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //constructor
        var myUser = User("bengi",20)
        myUser.name = "bengisu"
        myUser.age = 22

        println(myUser.age.toString())
        println(myUser.name)

        // Encapsulation
        var bengi = Musician("bengi","guitar",20)
        println(bengi.returnBandName("bngs"))
        println(bengi.returnBandName("asdfs"))

        //Inheritance
        var bengisu = SuperMusician("Bengisu","guitar",21)
        println(bengisu.name)
        println(bengisu.returnBandName("bngs"))
        println(bengisu.age)
        bengisu.sing()

        //Static Polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(1,2))
        println(mathematics.sum(1,2,3))

        //Dynamic Polymorpjism
        val animal1 = Animal()
        animal1.sound()
        val animal2 = Cat()
        animal2.test()
        animal2.sound()

        // Abstract
        // val people = People() abstract olduğu için oluşturulamıyor
        val usr = User("Bengi",20)
        println(usr.info())

        // Interface
        var guitar = Guitar()
        guitar.brand = "Midex"
        guitar.electro = false
        println(guitar.roomName)
        guitar.info()




    }
}