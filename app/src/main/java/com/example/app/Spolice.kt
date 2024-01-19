package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Spolice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spolice)
        val polices1=findViewById<CardView>(R.id.polices1)
        polices1.setOnClickListener {
            val intent= Intent(this,KotwaliPolice::class.java)
            startActivity(intent)

        }
        val polices2=findViewById<CardView>(R.id.polices2)
        polices2.setOnClickListener {
            val intent= Intent(this,RangeDIG::class.java)
            startActivity(intent)

        }
        val polices3=findViewById<CardView>(R.id.polices3)
        polices3.setOnClickListener {
            val intent= Intent(this,Superintendent::class.java)
            startActivity(intent)

        }
        val polices4=findViewById<CardView>(R.id.polices4)
        polices4.setOnClickListener {
            val intent= Intent(this,ShyletPolice::class.java)
            startActivity(intent)

        }
        val polices5=findViewById<CardView>(R.id.polices5)
        polices5.setOnClickListener {
            val intent= Intent(this,ShyletRAB::class.java)
            startActivity(intent)

        }
    }
}