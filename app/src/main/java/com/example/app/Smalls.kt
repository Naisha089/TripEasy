package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Smalls : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smalls)

        val malls1=findViewById<CardView>(R.id.malls1)
        malls1.setOnClickListener {
            val intent= Intent(this,Shohir::class.java)
            startActivity(intent)

        }
        val malls2=findViewById<CardView>(R.id.malls2)
        malls2.setOnClickListener {
            val intent= Intent(this,GoldemTower::class.java)
            startActivity(intent)

        }
        val malls3=findViewById<CardView>(R.id.malls3)
        malls3.setOnClickListener {
            val intent= Intent(this,Moyeen::class.java)
            startActivity(intent)

        }
        val malls4=findViewById<CardView>(R.id.malls4)
        malls4.setOnClickListener {
            val intent= Intent(this,NewShamoli::class.java)
            startActivity(intent)

        }
        val malls5=findViewById<CardView>(R.id.malls5)
        malls5.setOnClickListener {
            val intent= Intent(this,Eshop::class.java)
            startActivity(intent)

        }

    }
}