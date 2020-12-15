package com.example.healthelper.api.model

import com.example.healthelper.api.request.RegisterRequest
import com.example.healthelper.api.request.loginRequest
import com.example.healthelper.api.response.PsikologResponse
import com.example.healthelper.api.response.RegisterResponse
import com.example.healthelper.api.response.loginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface HealthelperInterface {

    @POST("register")
    fun register(@Body info: RegisterRequest): retrofit2.Call<RegisterResponse>

    @POST("login")
    fun login(@Body info: loginRequest): retrofit2.Call<loginResponse>

    @GET("psikolog")
    fun getPsikolog(): Call<ArrayList<PsikologResponse>>
}