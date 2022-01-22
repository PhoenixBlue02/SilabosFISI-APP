package com.phoenixblue.fisisylabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sistemas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistemas)
        tercero()
        cuarto()
    }

    fun tercero(){
        val tercerbotton= findViewById<Button>(R.id.boton3sis)

        tercerbotton.setOnClickListener {
            val abrirtercero= Intent(this, cursos3sistemas::class.java)
            startActivity(abrirtercero)
        }
    }
    fun cuarto() {
        val cuartobotton = findViewById<Button>(R.id.boton4sis)

        cuartobotton.setOnClickListener {
            val abrircuarto = Intent(this, cursos4sistemas::class.java)
            startActivity(abrircuarto)
        }
    }
}