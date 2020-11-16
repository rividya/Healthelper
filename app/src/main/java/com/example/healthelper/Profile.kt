package com.example.healthelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        button_edit_profile_profile.setOnClickListener {
            val intent = Intent(this, EditProfile::class.java)
            startActivity(intent)
        }

        button_booking_history_profile.setOnClickListener {
            val intent = Intent(this, BookingHistory::class.java)
            startActivity(intent)
        }

        button_signout_profile.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        button_home_profile.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        button_article_profile.setOnClickListener {
            val intent = Intent(this, Article::class.java)
            startActivity(intent)
        }

        button_booking_profile.setOnClickListener {
            val intent = Intent(this, BookingHistory::class.java)
            startActivity(intent)
        }

        button_profile_profile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}
