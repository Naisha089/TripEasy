package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Ksightseeing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ksightseeing)
        val seek1=findViewById<CardView>(R.id.seek1)
        seek1.setOnClickListener {
            val intent= Intent(this,Sundaebans::class.java)
            startActivity(intent)

        }
        val seek2=findViewById<CardView>(R.id.seek2)
        seek2.setOnClickListener {
            val intent= Intent(this,Gallamari::class.java)
            startActivity(intent)

        }
        val seek3=findViewById<CardView>(R.id.seek3)
        seek3.setOnClickListener {
            val intent= Intent(this,Senhati::class.java)
            startActivity(intent)

        }
        val seek4=findViewById<CardView>(R.id.seek4)
        seek4.setOnClickListener {
            val intent= Intent(this,Bakultala::class.java)
            startActivity(intent)

        }
        val seek5=findViewById<CardView>(R.id.seek5)
        seek5.setOnClickListener {
            val intent= Intent(this,RupshaKhan::class.java)
            startActivity(intent)

        }
    }
}