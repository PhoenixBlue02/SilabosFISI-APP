package com.phoenixblue.fisisylabus
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cursos3sistemas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos3sistemas)
        var eleccion: String

        val probarbutton= findViewById<Button>(R.id.probar)
            probarbutton.setOnClickListener {
                eleccion="Sis3_1"
                val abrirpdf= Intent(this, mostrarpdf::class.java)
                abrirpdf.putExtra("eleccion",eleccion)
                startActivity(abrirpdf)
            }
        val probar2button= findViewById<Button>(R.id.probar2)
        probar2button.setOnClickListener {
            eleccion="Sis3_2"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar3button= findViewById<Button>(R.id.probar3)
        probar3button.setOnClickListener {
            eleccion="Sis3_3"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar4button= findViewById<Button>(R.id.probar4)
        probar4button.setOnClickListener {
            eleccion="Sis3_4"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar5button= findViewById<Button>(R.id.probar5)
        probar5button.setOnClickListener {
            eleccion="Sis3_5"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar6button= findViewById<Button>(R.id.probar6)
        probar6button.setOnClickListener {
            eleccion="Sis3_6"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
        val probar7button= findViewById<Button>(R.id.probar7)
        probar7button.setOnClickListener {
            eleccion="Sis3_7"
            val abrirpdf= Intent(this, mostrarpdf::class.java)
            abrirpdf.putExtra("eleccion",eleccion)
            startActivity(abrirpdf)
        }
    }


}