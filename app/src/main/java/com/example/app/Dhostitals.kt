package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Dhostitals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dhostitals)

        val pera=findViewById<CardView>(R.id.pera)
        pera.setOnClickListener {
            val intent= Intent(this,Square::class.java)
            startActivity(intent)

        }
        val pera2=findViewById<CardView>(R.id.pera2)
        pera2.setOnClickListener {
            val intent= Intent(this,EverCare::class.java)
            startActivity(intent)

        }
        val pera3=findViewById<CardView>(R.id.pera3)
        pera3.setOnClickListener {
            val intent= Intent(this,DhakaMedical::class.java)
            startActivity(intent)

        }
        val pera4=findViewById<CardView>(R.id.pera4)
        pera4.setOnClickListener {
            val intent= Intent(this,United::class.java)
            startActivity(intent)

        }
        val pera5=findViewById<CardView>(R.id.pera5)
        pera5.setOnClickListener {
            val intent= Intent(this,PG::class.java)
            startActivity(intent)

        }
        val pera6=findViewById<CardView>(R.id.pera6)
        pera6.setOnClickListener {
            val intent= Intent(this,MapsActivity::class.java)
            startActivity(intent)

        }
        val pera7=findViewById<CardView>(R.id.pera7)
        pera7.setOnClickListener {
            val intent= Intent(this,MapsActivity::class.java)
            startActivity(intent)

        }


    }
}