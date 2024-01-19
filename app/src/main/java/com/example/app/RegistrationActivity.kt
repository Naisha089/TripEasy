package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_registration.*


class RegistrationActivity : AppCompatActivity() {
    lateinit var auth: FirebaseAuth
    private lateinit var databaseReference :  DatabaseReference
    private lateinit var database: FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        auth = FirebaseAuth.getInstance()
        FirebaseDatabase.getInstance().also { it.also { database = it } }
        database.reference!!.child("profile").also { databaseReference = it }

        register()
    }



    private fun register() {

        val firstnameInput=findViewById<EditText>(R.id.firstnameInput)
        val lastnameInput=findViewById<EditText>(R.id.lastnameInput)
        val emailEt=findViewById<EditText>(R.id.emailEt)
        val passwordEt=findViewById<EditText>(R.id.passwordEt)
        val registerBtn=findViewById<Button>(R.id.registerBtn)

        registerBtn.setOnClickListener {

            if(TextUtils.isEmpty(firstnameInput.text.toString())) {
                firstnameInput.error = "Please enter first name "
                return@setOnClickListener
            } else if(TextUtils.isEmpty(lastnameInput.text.toString())) {
                firstnameInput.error = "Please enter last name "
                return@setOnClickListener
            }else if(TextUtils.isEmpty(emailEt.text.toString())) {
                firstnameInput.error = "Please enter mail"
                return@setOnClickListener
            }else if(TextUtils.isEmpty(passwordEt.text.toString())) {
                firstnameInput.error = "Please enter password "
                return@setOnClickListener
            }


            auth.createUserWithEmailAndPassword(emailEt.text.toString(), passwordEt.text.toString())
                .addOnCompleteListener {
                    if(it.isSuccessful) {
                        val currentUser = auth.currentUser
                        val currentUSerDb = databaseReference.child((currentUser?.uid!!))
                        currentUSerDb.child("firstname").setValue(firstnameInput.text.toString())
                        currentUSerDb.child("lastname").setValue(lastnameInput.text.toString())
                        currentUSerDb.child("email").setValue(emailEt.text.toString())

                        Toast.makeText(this@RegistrationActivity, "Registration Success. ", Toast.LENGTH_LONG).show()
                        finish()

                    } else {
                        Toast.makeText(this@RegistrationActivity, "Registration failed, please try again! ", Toast.LENGTH_LONG).show()
                    }
                }

           //registerBtn.setOnClickListener(View.OnClickListener {startActivity(Intent(this,ProfileActivity::class.java)) })
        }
    }
}