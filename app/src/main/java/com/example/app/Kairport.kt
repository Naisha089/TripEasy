package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Kairport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kairport)
        val airk = findViewById<CardView>(R.id.airk)
        airk.setOnClickListener {
            val intent = Intent(this, KhanJahanAli::class.java)
            startActivity(intent)


        }
    }
}