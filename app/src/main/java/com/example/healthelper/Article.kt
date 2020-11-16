package com.example.healthelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_article.*
import kotlinx.android.synthetic.main.activity_booking_history.*

class Article : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        button_details_1.setOnClickListener {
            val intent = Intent(this, DetailArticle::class.java)
            startActivity(intent)
        }

        button_details_2.setOnClickListener {
            val intent = Intent(this, DetailArticle::class.java)
            startActivity(intent)
        }

        button_details_3.setOnClickListener {
            val intent = Intent(this, DetailArticle::class.java)
            startActivity(intent)
        }

        button_details_4.setOnClickListener {
            val intent = Intent(this, DetailArticle::class.java)
            startActivity(intent)
        }

        button_home_article.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        button_article_article.setOnClickListener {
            val intent = Intent(this, Article::class.java)
            startActivity(intent)
        }

        button_booking_article.setOnClickListener {
            val intent = Intent(this, BookingHistory::class.java)
            startActivity(intent)
        }

        button_profile_article.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}