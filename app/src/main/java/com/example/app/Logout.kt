package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Logout : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout)


         auth = FirebaseAuth.getInstance()
         database = FirebaseDatabase.getInstance()


        val yes=findViewById<Button>(R.id.yes)

       yes.setOnClickListener {
           auth.signOut()
            startActivity(Intent(this@Logout, LoginActivity::class.java))
            finish()
       }
        val no=findViewById<Button>(R.id.no)
        no.setOnClickListener(View.OnClickListener {startActivity(Intent(this,Dashboard::class.java)) })


    }

}