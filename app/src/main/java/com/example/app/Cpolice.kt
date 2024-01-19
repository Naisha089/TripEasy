package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Cpolice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cpolice)

        val policec1=findViewById<CardView>(R.id.policec1)
        policec1.setOnClickListener {
            val intent= Intent(this,Kotwali::class.java)
            startActivity(intent)

        }
        val policec2=findViewById<CardView>(R.id.policec2)
        policec2.setOnClickListener {
            val intent= Intent(this,EPZ::class.java)
            startActivity(intent)

        }
        val policec3=findViewById<CardView>(R.id.policec3)
        policec3.setOnClickListener {
            val intent= Intent(this,Chwakbazar::class.java)
            startActivity(intent)

        }
        val policec4=findViewById<CardView>(R.id.policec4)
        policec4.setOnClickListener {
            val intent= Intent(this,AkbarShah::class.java)
            startActivity(intent)

        }
        val policec5=findViewById<CardView>(R.id.ppolicec5)
        policec5.setOnClickListener {
            val intent= Intent(this,Bayazid::class.java)
            startActivity(intent)

        }
    }
}