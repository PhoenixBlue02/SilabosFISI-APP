package com.phoenixblue.fisisylabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class software : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_software)
        tercero()
        cuarto()
    }
    fun tercero(){
        val tercerbotton= findViewById<Button>(R.id.boton3soft)

        tercerbotton.setOnClickListener {
            val abrirtercero= Intent(this, cursos3software::class.java)
            startActivity(abrirtercero)
        }
    }
    fun cuarto() {
        val cuartobotton = findViewById<Button>(R.id.boton4soft)

        cuartobotton.setOnClickListener {
            val abrircuarto = Intent(this, cursos4software::class.java)
            startActivity(abrircuarto)
        }
    }
}