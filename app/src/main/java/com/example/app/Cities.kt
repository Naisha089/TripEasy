package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Cities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cities)


        val dhaka=findViewById<ImageView>(R.id.dhaka)
        val chittagong=findViewById<ImageView>(R.id.chittagong)
        val khulna=findViewById<ImageView>(R.id.khulna)
        val shylet=findViewById<ImageView>(R.id.shylet)
        dhaka.setOnClickListener {
            val intent= Intent(this,DhakaDash::class.java)
            startActivity(intent)

        }
        chittagong.setOnClickListener {
            val intent= Intent(this,ChittagongDash::class.java);
            startActivity(intent);


        }
        khulna.setOnClickListener {
            val intent= Intent(this,KhulnaDash::class.java)
            startActivity(intent)
        }
        shylet.setOnClickListener {

            startActivity(Intent(this,ShyletDash::class.java))

        }

    }
}