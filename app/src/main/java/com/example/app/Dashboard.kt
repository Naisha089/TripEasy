package com.example.app

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.view.menu.MenuView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.Group
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerlayout)
        val navView = findViewById<NavigationView>(R.id.navigationdrawer)

        val cities = findViewById<CardView>(R.id.cities)
        val emergencyNum = findViewById<CardView>(R.id.emergencyNum)
        val video = findViewById<CardView>(R.id.video)
        val location = findViewById<CardView>(R.id.location)
        val logout = findViewById<CardView>(R.id.logout)
        val credits = findViewById<CardView>(R.id.credits)

        //val location = findViewById<CardView>(R.id.location)




        emergencyNum.setOnClickListener {
            val intent = Intent(this, SpecialNum::class.java)
            startActivity(intent)

        }

        video.setOnClickListener {
            val intent = Intent(this, PlayVideos::class.java)
            startActivity(intent)

        }
        location.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)

        }
        cities.setOnClickListener {
            val intent = Intent(this, Cities::class.java)
            startActivity(intent)

        }

        logout.setOnClickListener {
            val intent = Intent(this, Logout::class.java)
            startActivity(intent)

        }
        credits.setOnClickListener {
            val intent = Intent(this, Credits::class.java)
            startActivity(intent)

        }





            toggle = ActionBarDrawerToggle(this, drawerlayout, R.string.open, R.string.close)
            drawerlayout.addDrawerListener(toggle)
            toggle.syncState()
            supportActionBar?.setDisplayHomeAsUpEnabled(true)


        }



        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (toggle.onOptionsItemSelected(item)) {
                return true
            }
            return super.onOptionsItemSelected(item)
        }

    }
