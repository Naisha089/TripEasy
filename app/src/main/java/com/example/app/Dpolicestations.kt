package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Dpolicestations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dpolicestations)
        val police=findViewById<CardView>(R.id.police)
        police.setOnClickListener {
            val intent= Intent(this,hatirjilPolice::class.java)
            startActivity(intent)

        }
        val police2=findViewById<CardView>(R.id.police2)
        police2.setOnClickListener {
            val intent= Intent(this,sherBanglaPolice::class.java)
            startActivity(intent)

        }
        val police3=findViewById<CardView>(R.id.police3)
        police3.setOnClickListener {
            val intent= Intent(this,touristPolice::class.java)
            startActivity(intent)

        }
        val police4=findViewById<CardView>(R.id.police4)
        police4.setOnClickListener {
            val intent= Intent(this,ACPolice::class.java)
            startActivity(intent)

        }
    }
}