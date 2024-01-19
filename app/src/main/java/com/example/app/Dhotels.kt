package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Dhotels : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dhotels)
        val hotel=findViewById<CardView>(R.id.hotel)
        hotel.setOnClickListener {
            val intent= Intent(this,DoreenHotel::class.java)
            startActivity(intent)

        }
        val hotel2=findViewById<CardView>(R.id.hotel2)
        hotel2.setOnClickListener {
            val intent= Intent(this,SixSeasonsHotel::class.java)
            startActivity(intent)

        }
        val hotel3=findViewById<CardView>(R.id.hotel3)
        hotel3.setOnClickListener {
            val intent= Intent(this,RadissonBlue::class.java)
            startActivity(intent)

        }
        val hotel4=findViewById<CardView>(R.id.hotel4)
        hotel4.setOnClickListener {
            val intent= Intent(this,PamPacificSonargong::class.java)
            startActivity(intent)

        }
        val hotel5=findViewById<CardView>(R.id.hotel5)
        hotel5.setOnClickListener {
            val intent= Intent(this,LaMeridan::class.java)
            startActivity(intent)

        }

    }
}