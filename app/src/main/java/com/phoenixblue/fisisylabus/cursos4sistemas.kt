package com.phoenixblue.fisisylabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cursos4sistemas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos4sistemas)
        var eleccion: String

        val probarbutton= findViewById<Button>(R.id.curso1)
        probarbutton.setOnClickListener {
            eleccion="Sis4_1"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar2button= findViewById<Button>(R.id.curso2)
        probar2button.setOnClickListener {
            eleccion="Sis4_2"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar3button= findViewById<Button>(R.id.curso3)
        probar3button.setOnClickListener {
            eleccion="Sis4_3"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar4button= findViewById<Button>(R.id.curso4)
        probar4button.setOnClickListener {
            eleccion="Sis4_4"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar5button= findViewById<Button>(R.id.curso5)
        probar5button.setOnClickListener {
            eleccion="Sis4_5"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar6button= findViewById<Button>(R.id.curso6)
        probar6button.setOnClickListener {
            eleccion="Sis4_6"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar7button= findViewById<Button>(R.id.curso7)
        probar7button.setOnClickListener {
            eleccion="Sis4_7"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
    }
}