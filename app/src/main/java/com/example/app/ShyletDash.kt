package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ShyletDash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shylet_dash)
        val hhotel2 = findViewById<ImageView>(R.id.hhotel2)
        hhotel2.setOnClickListener {
            val intent = Intent(this,Shotels::class.java)
            startActivity(intent)
        }
        val hhospital2= findViewById<ImageView>(R.id.hhospital2)

        hhospital2.setOnClickListener {
            val intent = Intent(this, Shospitals::class.java)
            startActivity(intent)
        }
        val mmall2 = findViewById<ImageView>(R.id.mmall2)

        mmall2.setOnClickListener {
            val intent = Intent(this, Smalls::class.java)
            startActivity(intent)
        }
        val aairport2 = findViewById<ImageView>(R.id.aairport2)

        aairport2.setOnClickListener {
            val intent = Intent(this, Sairport::class.java)
            startActivity(intent)
        }
        val ssightseeing2 = findViewById<ImageView>(R.id.ssightseeing2)

        ssightseeing2.setOnClickListener {
            val intent = Intent(this, Ssightseeing::class.java)
            startActivity(intent)
        }
        val ppoilce2 = findViewById<ImageView>(R.id.ppolicestation2)

        ppoilce2.setOnClickListener {
            val intent = Intent(this, Spolice::class.java)
            startActivity(intent)
        }

    }
}