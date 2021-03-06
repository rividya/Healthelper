package com.example.healthelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_article.*
import kotlinx.android.synthetic.main.activity_detail_article.*

class DetailArticle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_article)

        button_back_detail_article.setOnClickListener {
            val intent = Intent(this, Article::class.java)
            startActivity(intent)
        }

        button_home_detail_article.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        button_article_detail_article.setOnClickListener {
            val intent = Intent(this, Article::class.java)
            startActivity(intent)
        }

        button_booking_detail_article.setOnClickListener {
            val intent = Intent(this, BookingHistory::class.java)
            startActivity(intent)
        }

        button_profile_detail_article.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}
