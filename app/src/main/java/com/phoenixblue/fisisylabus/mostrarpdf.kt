package com.phoenixblue.fisisylabus
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mostrarpdf.*

class mostrarpdf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrarpdf)
        //choose=eleccionpdf()
        val obtener: Intent=intent
        var eleccion= obtener.getSerializableExtra("eleccion")

        //Sistemas 3º Ciclo
        if(eleccion=="Sis3_1"){
            pdflook.fromAsset("Sistemas 3_Programación y Fundamentos de Algorítmica.pdf").load()
        }
        if(eleccion=="Sis3_2"){
            pdflook.fromAsset("Sistemas 3_TeoriaGeneraldeSistemas.pdf").load()
        }
        if(eleccion=="Sis3_3"){
            pdflook.fromAsset("Sistemas 3_Organizacion_y_Administracion.pdf").load()
        }
        if(eleccion=="Sis3_4"){
            pdflook.fromAsset("Sistemas 3_IngenieriaEconomica.pdf").load()
        }
        if(eleccion=="Sis3_5"){
            pdflook.fromAsset("Sistemas 3_Estadistica.pdf").load()
        }
        if(eleccion=="Sis3_6"){
            pdflook.fromAsset("Sistemas 3_Series Y EcuacionesDiferenciales.pdf").load()
        }
        if(eleccion=="Sis3_7"){
            pdflook.fromAsset("Sistemas 3_MatematicaDiscreta.pdf").load()
        }
        //Sistemas 4º ciclo
        if(eleccion=="Sis4_1"){
            pdflook.fromAsset("Sistemas 4_Algoritmica y Programación Orientada a Objetos.pdf").load()
        }
        if(eleccion=="Sis4_2"){
            pdflook.fromAsset("Sistemas 4_Marketing.pdf").load()
        }
        if(eleccion=="Sis4_3"){
            pdflook.fromAsset("Sistemas 4_Contabilidad General.pdf").load()
        }
        if(eleccion=="Sis4_4"){
            pdflook.fromAsset("Sistemas 4_Procesos de Negocios.pdf").load()
        }
        if(eleccion=="Sis4_5"){
            pdflook.fromAsset("Sistemas 4_Métodos Numéricos.pdf").load()
        }
        if(eleccion=="Sis4_6"){
            pdflook.fromAsset("Sistemas 4_Probabilidades y muestreo.pdf").load()
        }
        if(eleccion=="Sis4_7"){
            pdflook.fromAsset("Sistemas 4_Fisica Electrónica y Sistemas Digitales.pdf").load()
        }

        //Software 3º ciclo
        if(eleccion=="Soft3_1"){
            pdflook.fromAsset("Software 3_Algoritmica 1.pdf").load()
        }
        if(eleccion=="Soft3_2"){
            pdflook.fromAsset("Software 3_Estadística.pdf").load()
        }
        if(eleccion=="Soft3_3"){
            pdflook.fromAsset("Software 3_Fisica Electrónica.pdf").load()
        }
        if(eleccion=="Soft3_4"){
            pdflook.fromAsset("Software 3_Ingeniería Económica.pdf").load()
        }
        if(eleccion=="Soft3_5"){
            pdflook.fromAsset("Software 3_Introducción al desarollo de Software.pdf").load()
        }
        if(eleccion=="Soft3_6"){
            pdflook.fromAsset("Software 3_Matemática Básica.pdf").load()
        }
        if(eleccion=="Soft3_7"){
            pdflook.fromAsset("Software 3_Organización y Administración.pdf").load()
        }
        //Software 4º ciclo
        if(eleccion=="Soft4_1"){
            pdflook.fromAsset("Software 4_Algoritmica 2.pdf").load()
        }
        if(eleccion=="Soft4_2"){
            pdflook.fromAsset("Software 4_Contabilidad para la gestión.pdf").load()
        }
        if(eleccion=="Soft4_3"){
            pdflook.fromAsset("Software 4_Innovación, tecnología y emprendimiento.pdf").load()
        }
        if(eleccion=="Soft4_4"){
            pdflook.fromAsset("Software 4_Probabilidades.pdf").load()
        }
        if(eleccion=="Soft4_5"){
            pdflook.fromAsset("Software 4_Procesos de Software.pdf").load()
        }
        if(eleccion=="Soft4_6"){
            pdflook.fromAsset("Software 4_Sistemas Digitales.pdf").load()
        }
        if(eleccion=="Soft4_7"){
            pdflook.fromAsset("Software 4_Matemáticas Discretas.pdf").load()
        }
    }
}