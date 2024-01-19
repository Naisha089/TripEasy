package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Kpolice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kpolice)
        val policek1=findViewById<CardView>(R.id.policek1)
        policek1.setOnClickListener {
            val intent= Intent(this,RailwayPolice::class.java)
            startActivity(intent)

        }
        val policek2=findViewById<CardView>(R.id.policek2)
        policek2.setOnClickListener {
            val intent= Intent(this,KDIG::class.java)
            startActivity(intent)

        }
        val policek3=findViewById<CardView>(R.id.policek3)
        policek3.setOnClickListener {
            val intent= Intent(this,ShipYeard::class.java)
            startActivity(intent)

        }
        val policek4=findViewById<CardView>(R.id.policek4)
        policek4.setOnClickListener {
            val intent= Intent(this,Digholia::class.java)
            startActivity(intent)

        }
        val policek5=findViewById<CardView>(R.id.policek5)
        policek5.setOnClickListener {
            val intent= Intent(this,IndustrialPolice::class.java)
            startActivity(intent)

        }
    }
}