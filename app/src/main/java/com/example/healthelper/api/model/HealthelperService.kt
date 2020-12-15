package com.example.healthelper.api.model

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HealthelperService {

    private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        this.level = HttpLoggingInterceptor.Level.BODY
    }

    private val client: OkHttpClient = OkHttpClient.Builder().apply {
        this.addInterceptor(interceptor)
    }.build()

    fun getHealthelperService(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://192.168.1.8:8000")
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}