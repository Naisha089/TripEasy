package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.ListView
import androidx.cardview.widget.CardView

class DhakaDash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dhaka_dash)

        val resturant = findViewById<ImageView>(R.id.resturant)

        resturant.setOnClickListener {
            val intent = Intent(this,Dhotels::class.java)
            startActivity(intent)
        }
        val hospital = findViewById<ImageView>(R.id.hospital)

        hospital.setOnClickListener {
            val intent = Intent(this, Dhostitals::class.java)
            startActivity(intent)
        }
        val mall = findViewById<ImageView>(R.id.mall)

        mall.setOnClickListener {
            val intent = Intent(this, Dmalls::class.java)
            startActivity(intent)
        }
        val airport = findViewById<ImageView>(R.id.airport)

        airport.setOnClickListener {
            val intent = Intent(this, Dairport::class.java)
            startActivity(intent)
        }
        val sightseeing = findViewById<ImageView>(R.id.sightseeing)

        sightseeing.setOnClickListener {
            val intent = Intent(this, Dsightseeing::class.java)
            startActivity(intent)
        }
        val poilce = findViewById<ImageView>(R.id.policestation)

        poilce.setOnClickListener {
            val intent = Intent(this, Dpolicestations::class.java)
            startActivity(intent)
        }

    }
}