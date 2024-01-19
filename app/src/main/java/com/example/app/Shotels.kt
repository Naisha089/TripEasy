package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Shotels : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shotels)
        val hotels1=findViewById<CardView>(R.id.hotels1)
        hotels1.setOnClickListener {
            val intent= Intent(this,Rose::class.java)
            startActivity(intent)

        }
        val hotels2=findViewById<CardView>(R.id.hotels2)
        hotels2.setOnClickListener {
            val intent= Intent(this,Norjahan::class.java)
            startActivity(intent)

        }
        val hotels3=findViewById<CardView>(R.id.hotels3)
        hotels3.setOnClickListener {
            val intent= Intent(this,Mira::class.java)
            startActivity(intent)

        }
        val hotels4=findViewById<CardView>(R.id.hotels4)
        hotels4.setOnClickListener {
            val intent= Intent(this,Bottomhill::class.java)
            startActivity(intent)

        }
        val hotels5=findViewById<CardView>(R.id.hotels5)
        hotels5.setOnClickListener {
            val intent= Intent(this,Sultan::class.java)
            startActivity(intent)

        }
    }
}