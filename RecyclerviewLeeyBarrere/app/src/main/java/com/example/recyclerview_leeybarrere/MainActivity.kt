package com.example.recyclerview_leeybarrere

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

data class Alumno(val nombre:String, val edad:Int, val grupo:String)

    val alumnos = ListOf(

    )

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super.onStart()
        val rv = findViewById<RecyclerView>(R.id.ListaAlumnos)
    }

}
