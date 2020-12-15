package com.example.healthelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.healthelper.api.model.HealthelperInterface
import com.example.healthelper.api.model.HealthelperService
import com.example.healthelper.api.model.PaketAdapter
import com.example.healthelper.api.response.PaketResponse
import com.example.healthelper.api.response.PsikologResponse
import kotlinx.android.synthetic.main.activity_detail_article.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_item_list.*
import kotlinx.android.synthetic.main.activity_psychologist.*
import kotlinx.android.synthetic.main.activity_psychologist.rvPsikolog
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvPaket.setHasFixedSize(true)
        rvPaket.layoutManager = LinearLayoutManager(this)

        val retIn = HealthelperService.getHealthelperService().create(HealthelperInterface::class.java)
        retIn.getPaket().enqueue(object: Callback<List<PaketResponse>> {
            override fun onResponse(
                call: Call<List<PaketResponse>>,
                response: Response<List<PaketResponse>>
            ) {
                rvPaket.adapter = PaketAdapter(response.body())
            }

            override fun onFailure(call: Call<List<PaketResponse>>, t: Throwable) {

            }

        })

        button_special_package_home.setOnClickListener {
            val intent = Intent(this, Psychologist::class.java)
            startActivity(intent)
        }

//        button_booking.setOnClickListener {
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
