package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.app.R.layout.activity_dashboard
import com.example.app.R.layout.activity_login
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_login)

        auth = FirebaseAuth.getInstance()

       val currentuser = auth.currentUser
        if (currentuser != null) {
            startActivity(Intent(this@LoginActivity,Dashboard::class.java))
            finish()
       }
        login()
    }

    private fun login() {
        val loginBtn=findViewById<Button>(R.id.loginBtn)
        val emailEt=findViewById<EditText>(R.id.emailEt)
        val passwordEt=findViewById<EditText>(R.id.passwordEt)
        val registerText=findViewById<TextView>(R.id.registerText)

        loginBtn.setOnClickListener {

            if (TextUtils.isEmpty(emailEt.text.toString())) {
                emailEt.error = "Please enter email"
                return@setOnClickListener
            } else if (TextUtils.isEmpty(passwordEt.text.toString())) {
                emailEt.error = "Please enter password"
                return@setOnClickListener
            }
            auth.signInWithEmailAndPassword(
                emailEt.text.toString(),
                passwordEt.text.toString()
            )
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        startActivity(Intent(this@LoginActivity, Dashboard::class.java))
                        finish()
                    } else {
                        Toast.makeText(
                            this@LoginActivity,
                            "Login failed, please try again! ",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }

        }

        registerText.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegistrationActivity::class.java))

        }

    }
}