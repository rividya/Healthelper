package com.example.healthelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_psychologist.*

class Psychologist : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psychologist)

        button_back_psychologist.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        button_booking_1.setOnClickListener {
            val intent = Intent(this, DetailPsychologist::class.java)
            startActivity(intent)
        }

        button_booking_2.setOnClickListener {
            val intent = Intent(this, DetailPsychologist::class.java)
            startActivity(intent)
        }

        button_booking_3.setOnClickListener {
            val intent = Intent(this, DetailPsychologist::class.java)
            startActivity(intent)
        }

        button_booking_4.setOnClickListener {
            val intent = Intent(this, DetailPsychologist::class.java)
            startActivity(intent)
        }

        button_booking_5.setOnClickListener {
            val intent = Intent(this, DetailPsychologist::class.java)
            startActivity(intent)
        }

        button_booking_6.setOnClickListener {
            val intent = Intent(this, DetailPsychologist::class.java)
            startActivity(intent)
        }

        button_booking_7.setOnClickListener {
            val intent = Intent(this, DetailPsychologist::class.java)
            startActivity(intent)
        }
    }
}
