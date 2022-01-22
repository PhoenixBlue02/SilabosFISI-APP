package com.phoenixblue.fisisylabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cursos3software : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos3software)
        var eleccion: String

        val probarbutton= findViewById<Button>(R.id.curso1_3)
        probarbutton.setOnClickListener {
            eleccion="Soft3_1"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar2button= findViewById<Button>(R.id.curso2_3)
        probar2button.setOnClickListener {
            eleccion="Soft3_2"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar3button= findViewById<Button>(R.id.curso3_3)
        probar3button.setOnClickListener {
            eleccion="Soft3_3"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar4button= findViewById<Button>(R.id.curso4_3)
        probar4button.setOnClickListener {
            eleccion="Soft3_4"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar5button= findViewById<Button>(R.id.curso5_3)
        probar5button.setOnClickListener {
            eleccion="Soft3_5"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar6button= findViewById<Button>(R.id.curso6_3)
        probar6button.setOnClickListener {
            eleccion="Soft3_6"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar7button= findViewById<Button>(R.id.curso7_3)
        probar7button.setOnClickListener {
            eleccion="Soft3_7"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
    }
}