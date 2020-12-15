package com.example.healthelper.api.model

import com.example.healthelper.api.response.PaketResponse
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.healthelper.R
import com.example.healthelper.api.response.PsikologResponse
import kotlinx.android.synthetic.main.activity_home.view.*
import kotlinx.android.synthetic.main.activity_item_list.view.*

class PaketAdapter(val data: List<PaketResponse>?) : RecyclerView.Adapter<PaketAdapter.PaketHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaketHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_list, parent, false)
        return PaketHolder(v)
    }
    override fun getItemCount(): Int = data?.size ?: 0
    override fun onBindViewHolder(holder: PaketHolder, position: Int) {
        holder.bind(data?.get(position))
    }
    class PaketHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(get: PaketResponse?) {
            itemView.nama_paket.text = get?.nama_paket
            itemView.harga_paket.text = get?.harga_paket.toString()
        }
    }
}
