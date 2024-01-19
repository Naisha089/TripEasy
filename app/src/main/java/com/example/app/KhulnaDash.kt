package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class KhulnaDash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khulna_dash)
        val hotell4 = findViewById<ImageView>(R.id.hotell4)

        hotell4.setOnClickListener {
            val intent = Intent(this,Khotels::class.java)
            startActivity(intent)
        }
        val hospitall4 = findViewById<ImageView>(R.id.hospitall4)

        hospitall4.setOnClickListener {
            val intent = Intent(this, Khospitals::class.java)
            startActivity(intent)
        }
        val malll4 = findViewById<ImageView>(R.id.malll4)

        malll4.setOnClickListener {
            val intent = Intent(this, Kmalls::class.java)
            startActivity(intent)
        }
        val airportt4 = findViewById<ImageView>(R.id.airportt4)

        airportt4.setOnClickListener {
            val intent = Intent(this, Kairport::class.java)
            startActivity(intent)
        }
        val sightseeingg4 = findViewById<ImageView>(R.id.sightseeingg4)

        sightseeingg4.setOnClickListener {
            val intent = Intent(this, Ksightseeing::class.java)
            startActivity(intent)
        }
        val poilcee4 = findViewById<ImageView>(R.id.policestationn4)

        poilcee4.setOnClickListener {
            val intent = Intent(this, Kpolice::class.java)
            startActivity(intent)
        }
    }
}