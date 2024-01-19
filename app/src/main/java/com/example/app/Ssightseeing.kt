package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Ssightseeing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ssightseeing)
        val sees1=findViewById<CardView>(R.id.sees1)
        sees1.setOnClickListener {
            val intent= Intent(this,Bisnakandi::class.java)
            startActivity(intent)

        }
        val sees2=findViewById<CardView>(R.id.sees2)
        sees2.setOnClickListener {
            val intent= Intent(this,Jaflong::class.java)
            startActivity(intent)

        }
        val sees3=findViewById<CardView>(R.id.sees3)
        sees3.setOnClickListener {
            val intent= Intent(this,Ratargul::class.java)
            startActivity(intent)

        }
        val sees4=findViewById<CardView>(R.id.sees4)
        sees4.setOnClickListener {
            val intent= Intent(this,Dargah::class.java)
            startActivity(intent)

        }
        val sees5=findViewById<CardView>(R.id.sees5)
        sees5.setOnClickListener {
            val intent= Intent(this,Lalakhal::class.java)
            startActivity(intent)

        }
    }
}