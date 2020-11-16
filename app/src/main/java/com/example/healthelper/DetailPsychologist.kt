package com.example.healthelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_article.*
import kotlinx.android.synthetic.main.activity_detail_psychologist.*

class DetailPsychologist : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_psychologist)

        button_back_detail_psychologist.setOnClickListener {
            val intent = Intent(this, Psychologist::class.java)
            startActivity(intent)
        }

        button_make_an_appointment.setOnClickListener {
            val intent = Intent(this, DetailBooking::class.java)
            startActivity(intent)
        }
    }
}
