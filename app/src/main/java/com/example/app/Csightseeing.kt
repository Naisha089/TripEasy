package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Csightseeing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_csightseeing)
        val seec1=findViewById<CardView>(R.id.seec1)
        seec1.setOnClickListener {
            val intent= Intent(this,Patenga::class.java)
            startActivity(intent)

        }
        val seec2=findViewById<CardView>(R.id.seec2)
        seec2.setOnClickListener {
            val intent= Intent(this,Chandrath::class.java)
            startActivity(intent)

        }
        val seec3=findViewById<CardView>(R.id.seec3)
        seec3.setOnClickListener {
            val intent= Intent(this,Khoiyachara::class.java)
            startActivity(intent)

        }
        val seec4=findViewById<CardView>(R.id.seec4)
        seec4.setOnClickListener {
            val intent= Intent(this,Sitakunda::class.java)
            startActivity(intent)

        }
        val seec5=findViewById<CardView>(R.id.seec5)
        seec5.setOnClickListener {
            val intent= Intent(this,Coxbazar::class.java)
            startActivity(intent)

        }
    }
}