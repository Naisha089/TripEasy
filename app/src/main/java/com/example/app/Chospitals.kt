package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Chospitals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chospitals)
        val med1=findViewById<CardView>(R.id.med1)
        med1.setOnClickListener {
            val intent= Intent(this,MemonMarternity::class.java)
            startActivity(intent)

        }
        val med2=findViewById<CardView>(R.id.med2)
        med2.setOnClickListener {
            val intent= Intent(this,DentalCollege::class.java)
            startActivity(intent)

        }
        val med3=findViewById<CardView>(R.id.med3)
        med3.setOnClickListener {
            val intent= Intent(this,RoyalHos::class.java)
            startActivity(intent)

        }
        val med4=findViewById<CardView>(R.id.med4)
        med4.setOnClickListener {
            val intent= Intent(this,DeltaHealth::class.java)
            startActivity(intent)

        }

        val med6=findViewById<CardView>(R.id.med6)
        med6.setOnClickListener {
            val intent= Intent(this,LoinsEye::class.java)
            startActivity(intent)

        }
    }
}