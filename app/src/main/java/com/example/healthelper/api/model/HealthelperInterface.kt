package com.example.healthelper.api.model

import com.example.healthelper.api.request.RegisterRequest
import com.example.healthelper.api.response.RegisterResponse
import retrofit2.http.POST
import retrofit2.http.Body

interface HealthelperInterface {

    @POST("register")
    fun register(@Body info: RegisterRequest): retrofit2.Call<RegisterResponse>
}