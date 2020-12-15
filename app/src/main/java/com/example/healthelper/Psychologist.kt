package com.example.healthelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.healthelper.api.model.HealthelperInterface
import com.example.healthelper.api.model.HealthelperService
import com.example.healthelper.api.request.RegisterRequest
import com.example.healthelper.api.response.PsikologResponse
import com.example.healthelper.api.response.RegisterResponse
import kotlinx.android.synthetic.main.activity_psikolog_list.*
import kotlinx.android.synthetic.main.activity_psychologist.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class Psychologist : AppCompatActivity() {

    private val list = ArrayList<PsikologResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psychologist)

        rvPsikolog.setHasFixedSize(true)
        rvPsikolog.layoutManager = LinearLayoutManager(this)

        val retIn = HealthelperService.getHealthelperService().create(HealthelperInterface::class.java)
        retIn.getPsikolog().enqueue(object: Callback<ArrayList<PsikologResponse>>{
            override fun onFailure(call: Call<ArrayList<PsikologResponse>>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<ArrayList<PsikologResponse>>,
                response: Response<ArrayList<PsikologResponse>>
            ) {
                val responseCode = response.code().toString()

            }
        })

        button_back_psychologist.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        button_booking.setOnClickListener {
            // get post data

//            val intent = Intent(this, DetailPsychologist::class.java)
//            startActivity(intent)
        }
    }
}
