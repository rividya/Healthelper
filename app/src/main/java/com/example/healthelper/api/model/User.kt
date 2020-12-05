package com.example.healthelper.api.model

import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("id_user")
    var id: Int,

    @SerializedName("nama_user")
    var name: String?,

    @SerializedName("email_user")
    var email: String?,

    @SerializedName("no_hp_user")
    var phoneNumber: String?,

    @SerializedName("alamat_user")
    var address: String?,

    @SerializedName("password_user")
    var password: String?
)