package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Dmalls : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dmalls)

        val mall=findViewById<CardView>(R.id.mall)
        mall.setOnClickListener {
            val intent= Intent(this,BashudaraCity::class.java)
            startActivity(intent)

        }
        val mall2=findViewById<CardView>(R.id.mall2)
        mall2.setOnClickListener {
            val intent= Intent(this,Shimanto::class.java)
            startActivity(intent)

        }
        val mall3=findViewById<CardView>(R.id.mall3)
        mall3.setOnClickListener {
            val intent= Intent(this,Jamuna::class.java)
            startActivity(intent)

        }
        val mall4=findViewById<CardView>(R.id.mall4)
        mall4.setOnClickListener {
            val intent= Intent(this,PolicePlaza::class.java)
            startActivity(intent)

        }
        val mall5=findViewById<CardView>(R.id.mall5)
        mall5.setOnClickListener {
            val intent= Intent(this,NewMarket::class.java)
            startActivity(intent)

        }
        val mall6=findViewById<CardView>(R.id.mall6)
        mall6.setOnClickListener {
            val intent= Intent(this,Shimanto::class.java)
            startActivity(intent)

        }
    }
}