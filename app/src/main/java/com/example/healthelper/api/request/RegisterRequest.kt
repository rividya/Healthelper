package com.example.healthelper.api.request

data class RegisterRequest (
    val nama_user: String?,
    val email_user: String?,
    val no_hp_user: String?,
    val alamat_user: String?,
    val password_user: String
)