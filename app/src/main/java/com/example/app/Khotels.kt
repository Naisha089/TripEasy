package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Khotels : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khotels)
        val hotelk1=findViewById<CardView>(R.id.hotelk1)
        hotelk1.setOnClickListener {
            val intent= Intent(this,CityInn::class.java)
            startActivity(intent)

        }
        val hotelk2=findViewById<CardView>(R.id.hotelk2)
        hotelk2.setOnClickListener {
            val intent= Intent(this,CastleSalam::class.java)
            startActivity(intent)

        }
        val hotelk3=findViewById<CardView>(R.id.hotelk3)
        hotelk3.setOnClickListener {
            val intent= Intent(this,RoyalIntra::class.java)
            startActivity(intent)

        }
        val hotelk4=findViewById<CardView>(R.id.hotelk4)
        hotelk4.setOnClickListener {
            val intent= Intent(this,WesternInn::class.java)
            startActivity(intent)

        }
        val hotelk5=findViewById<CardView>(R.id.hotelk5)
        hotelk5.setOnClickListener {
            val intent= Intent(this,HotelCityInn::class.java)
            startActivity(intent)

        }


        }
    }
