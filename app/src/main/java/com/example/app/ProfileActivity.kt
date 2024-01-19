package com.example.app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.google.firebase.ktx.Firebase
import java.lang.NullPointerException
import kotlinx.android.synthetic.main.activity_profile.*



class ProfileActivity : AppCompatActivity() {
    //private lateinit var database: DatabaseReference
   // private var database = Firebase.database.reference
    private lateinit var auth: FirebaseAuth
    private lateinit var databaseReference :  DatabaseReference
    private lateinit var database: FirebaseDatabase

    val firstnameInput: TextView =findViewById(R.id.firstnameInput)
    val lastnameInput:TextView=findViewById(R.id.lastnameInput)
    private val emailEt:TextView =findViewById(R.id. emailEt)

    private val logoutButton: Button =findViewById(R.id.logoutButton)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("profile")

        loadProfile()
    }


    @SuppressLint("SetTextI18n")
    private fun loadProfile() {

        val user = auth.currentUser
        val userreference = databaseReference?.child(user?.uid!!)

        emailEt.text = "Email  -- > "+user?.email

        userreference?.addValueEventListener(object: ValueEventListener{

            @SuppressLint("SetTextI18n")
            override fun onDataChange(snapshot: DataSnapshot) {

                ("Firstname - - > "+snapshot.child("firstname").value.toString()).also { firstnameInput.text = it }
                ("Last name - -> "+snapshot.child("lastname").value.toString()).also { lastnameInput.text = it }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")

                //val missingId:findViewById.resources.getResourceName(id)
                //throw NullPointerException("Missing required view with ID: $missingId")

            }
        })


        logoutButton.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this@ProfileActivity, LoginActivity::class.java))
            finish()
        }
    }
}