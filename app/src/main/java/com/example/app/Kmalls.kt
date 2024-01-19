package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Kmalls : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kmalls)
        val mallk1=findViewById<CardView>(R.id.mallk1)
        mallk1.setOnClickListener {
            val intent= Intent(this,Kshopping::class.java)
            startActivity(intent)

        }
        val mallk2=findViewById<CardView>(R.id.mallk2)
        mallk2.setOnClickListener {
            val intent= Intent(this,Joili::class.java)
            startActivity(intent)

        }
        val mallk3=findViewById<CardView>(R.id.mallk3)
        mallk3.setOnClickListener {
            val intent= Intent(this,KhulnaNewMarket::class.java)
            startActivity(intent)

        }

        val mallk5=findViewById<CardView>(R.id.mallk5)
        mallk5.setOnClickListener {
            val intent= Intent(this,SM::class.java)
            startActivity(intent)

        }
        val mallk6=findViewById<CardView>(R.id.mallk6)
        mallk6.setOnClickListener {
            val intent= Intent(this,LifeStyle::class.java)
            startActivity(intent)

        }
    }
}