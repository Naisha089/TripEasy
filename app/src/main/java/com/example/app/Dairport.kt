package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Dairport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dairport)
        val air = findViewById<CardView>(R.id.air)
        air.setOnClickListener {
            val intent = Intent(this, Shahjalar::class.java)
            startActivity(intent)
        }
    }
}