package com.example.healthelper.api

import com.google.gson.annotations.SerializedName

data class result (
    @SerializedName("token")
    val token: String?
)