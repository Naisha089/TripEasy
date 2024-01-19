package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Dsightseeing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dsightseeing)

        val see=findViewById<CardView>(R.id.see)
        see.setOnClickListener {
            val intent= Intent(this,AhsanManzil::class.java)
            startActivity(intent)

        }
        val see2=findViewById<CardView>(R.id.see2)
        see2.setOnClickListener {
            val intent= Intent(this,Sonargaon::class.java)
            startActivity(intent)

        }
        val see3=findViewById<CardView>(R.id.see3)
        see3.setOnClickListener {
            val intent= Intent(this,LalbagFort::class.java)
            startActivity(intent)

        }
        val see4=findViewById<CardView>(R.id.see4)
        see4.setOnClickListener {
            val intent= Intent(this,ShahidMiner::class.java)
            startActivity(intent)

        }
        val see5=findViewById<CardView>(R.id.see5)
        see5.setOnClickListener {
            val intent= Intent(this,Dhakashwari::class.java)
            startActivity(intent)

        }

    }
}