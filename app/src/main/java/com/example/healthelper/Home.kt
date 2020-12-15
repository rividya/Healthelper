package com.example.healthelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_article.*
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        button_special_package_home.setOnClickListener {
            val intent = Intent(this, Psychologist::class.java)
            startActivity(intent)
        }

//        button_booking_A.setOnClickListener {
//            val intent = Intent(this, Psychologist::class.java)
//            startActivity(intent)
//        }

//        button_booking_B.setOnClickListener {
//            val intent = Intent(this, Psychologist::class.java)
//            startActivity(intent)
//        }

//        button_booking_C.setOnClickListener {
//            val intent = Intent(this, Psychologist::class.java)
//            startActivity(intent)
//        }


        button_home_home.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        button_article_home.setOnClickListener {
            val intent = Intent(this, Article::class.java)
            startActivity(intent)
        }

        button_booking_home.setOnClickListener {
            val intent = Intent(this, BookingHistory::class.java)
            startActivity(intent)
        }

        button_profile_home.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}
