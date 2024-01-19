package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Khospitals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khospitals)
        val medk1=findViewById<CardView>(R.id.medk1)
        medk1.setOnClickListener {
            val intent= Intent(this,Apollo::class.java)
            startActivity(intent)

        }
        val medk2=findViewById<CardView>(R.id.medk2)
        medk2.setOnClickListener {
            val intent= Intent(this,Ali::class.java)
            startActivity(intent)

        }
        val medk3=findViewById<CardView>(R.id.medk3)
        medk3.setOnClickListener {
            val intent= Intent(this,AlFaruk::class.java)
            startActivity(intent)

        }
        val medk4=findViewById<CardView>(R.id.medk4)
        medk4.setOnClickListener {
            val intent= Intent(this,AuroDiagnostic::class.java)
            startActivity(intent)

        }
        val medk5=findViewById<CardView>(R.id.medk5)
        medk5.setOnClickListener {
            val intent= Intent(this,BasundharaDiagnostic::class.java)
            startActivity(intent)

        }
    }
}