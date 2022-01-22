package com.phoenixblue.fisisylabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cursos4software : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos4software)
        var eleccion: String

        val probarbutton= findViewById<Button>(R.id.curso1_4)
        probarbutton.setOnClickListener {
            eleccion="Soft4_1"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar2button= findViewById<Button>(R.id.curso2_4)
        probar2button.setOnClickListener {
            eleccion="Soft4_2"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar3button= findViewById<Button>(R.id.curso3_4)
        probar3button.setOnClickListener {
            eleccion="Soft4_3"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar4button= findViewById<Button>(R.id.curso4_4)
        probar4button.setOnClickListener {
            eleccion="Soft4_4"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar5button= findViewById<Button>(R.id.curso5_4)
        probar5button.setOnClickListener {
            eleccion="Soft4_5"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar6button= findViewById<Button>(R.id.curso6_4)
        probar6button.setOnClickListener {
            eleccion="Soft4_6"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar7button= findViewById<Button>(R.id.curso7_4)
        probar7button.setOnClickListener {
            eleccion="Soft4_7"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
    }
}