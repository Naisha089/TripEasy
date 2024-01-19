package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Shospitals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shospitals)

        val meds1=findViewById<CardView>(R.id.meds1)
        meds1.setOnClickListener {
            val intent= Intent(this,HolyDental::class.java)
            startActivity(intent)

        }
        val meds2=findViewById<CardView>(R.id.meds2)
        meds2.setOnClickListener {
            val intent= Intent(this,Jalarbad::class.java)
            startActivity(intent)

        }
        val meds3=findViewById<CardView>(R.id.meds3)
        meds3.setOnClickListener {
            val intent= Intent(this,IbnSina::class.java)
            startActivity(intent)

        }
        val meds4=findViewById<CardView>(R.id.meds4)
        meds4.setOnClickListener {
            val intent= Intent(this,MotherCare::class.java)
            startActivity(intent)

        }
        val meds5=findViewById<CardView>(R.id.meds5)
        meds5.setOnClickListener {
            val intent= Intent(this,Shisu::class.java)
            startActivity(intent)

        }

    }
}