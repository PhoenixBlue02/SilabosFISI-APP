package com.phoenixblue.fisisylabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sistemas()
        software()
    }

    fun sistemas(){
        val sistemasbutton= findViewById<Button>(R.id.sistemasboton)

        sistemasbutton.setOnClickListener {
            val abrirsistemas= Intent(this, sistemas::class.java)
            startActivity(abrirsistemas)
        }
    }
    fun software(){
        val softwarebutton= findViewById<Button>(R.id.softwareboton)

        softwarebutton.setOnClickListener {
            val abrirsoftware= Intent(this, software::class.java)
            startActivity(abrirsoftware)
        }
    }
}