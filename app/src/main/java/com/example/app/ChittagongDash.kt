package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ChittagongDash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chittagong_dash)
        val hotel1 = findViewById<ImageView>(R.id.hotel1)

        hotel1.setOnClickListener {
            val intent = Intent(this,Chotels::class.java)
            startActivity(intent)
        }
        val hospital1 = findViewById<ImageView>(R.id.hospital1)

        hospital1.setOnClickListener {
            val intent = Intent(this, Chospitals::class.java)
            startActivity(intent)
        }
        val mall1 = findViewById<ImageView>(R.id.mall1)

        mall1.setOnClickListener {
            val intent = Intent(this, Cmalls::class.java)
            startActivity(intent)
        }
        val airport1 = findViewById<ImageView>(R.id.airport1)

        airport1.setOnClickListener {
            val intent = Intent(this, Cairport::class.java)
            startActivity(intent)
        }
        val sightseeing1 = findViewById<ImageView>(R.id.sightseeing1)

        sightseeing1.setOnClickListener {
            val intent = Intent(this, Csightseeing::class.java)
            startActivity(intent)
        }
        val poilce1 = findViewById<ImageView>(R.id.policestation1)

        poilce1.setOnClickListener {
            val intent = Intent(this, Cpolice::class.java)
            startActivity(intent)
        }

    }
}