package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Chotels : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chotels)
        val hotelc1=findViewById<CardView>(R.id.hotelc1)
        hotelc1.setOnClickListener {
            val intent= Intent(this,Peninsula::class.java)
            startActivity(intent)

        }
        val hotelc2=findViewById<CardView>(R.id.hotelc2)
        hotelc2.setOnClickListener {
            val intent= Intent(this,Agrabad::class.java)
            startActivity(intent)

        }
        val hotelc3=findViewById<CardView>(R.id.hotelc3)
        hotelc3.setOnClickListener {
            val intent= Intent(this,RadissonBay::class.java)
            startActivity(intent)

        }
        val hotelc4=findViewById<CardView>(R.id.hotelc4)
        hotelc4.setOnClickListener {
            val intent= Intent(this,Avenue::class.java)
            startActivity(intent)

        }
        val hotelc5=findViewById<CardView>(R.id.hotelc5)
        hotelc5.setOnClickListener {
            val intent= Intent(this,Orchid::class.java)
            startActivity(intent)

        }
    }
}