package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Cmalls : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cmalls)
        val mallc1=findViewById<CardView>(R.id.mallc1)
        mallc1.setOnClickListener {
            val intent= Intent(this,Afmi::class.java)
            startActivity(intent)

        }

        val mallc3=findViewById<CardView>(R.id.mallc3)
        mallc3.setOnClickListener {
            val intent= Intent(this,Ameen::class.java)
            startActivity(intent)

        }
        val mallc4=findViewById<CardView>(R.id.mallc4)
        mallc4.setOnClickListener {
            val intent= Intent(this,CentralShop::class.java)
            startActivity(intent)

        }
        val mallc5=findViewById<CardView>(R.id.mallc5)
        mallc5.setOnClickListener {
            val intent= Intent(this,Finlay::class.java)
            startActivity(intent)

        }
        val mallc6=findViewById<CardView>(R.id.mallc6)
        mallc6.setOnClickListener {
            val intent= Intent(this,Lucky::class.java)
            startActivity(intent)

        }

    }
}