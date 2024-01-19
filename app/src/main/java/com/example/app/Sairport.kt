package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Sairport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sairport)
        val airs = findViewById<CardView>(R.id.airs)
        airs.setOnClickListener {
            val intent = Intent(this, Osmani::class.java)
            startActivity(intent)
        }
    }
}