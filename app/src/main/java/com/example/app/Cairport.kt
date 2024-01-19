package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Cairport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cairport)
        val cair = findViewById<CardView>(R.id.cair)
        cair.setOnClickListener {
            val intent = Intent(this, Aamnat::class.java)
            startActivity(intent)
        }
    }
}