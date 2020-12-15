package com.example.healthelper.api.response

import com.google.gson.annotations.SerializedName

data class PsikologResponse (
    val id_psikolog: Int,
    val nama_psikolog: String?,
    val tahun_psikolog: String?,

    @SerializedName("body")
    val deskripsi_psikolog: String?
)