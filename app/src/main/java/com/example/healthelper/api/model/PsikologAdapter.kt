package com.example.healthelper.api.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.healthelper.R
import com.example.healthelper.api.response.PsikologResponse
import kotlinx.android.synthetic.main.activity_item_list.view.*
import kotlinx.android.synthetic.main.activity_psikolog_list.view.*
import kotlinx.android.synthetic.main.activity_psychologist.view.*
import kotlinx.android.synthetic.main.activity_psychologist.view.rvPsikolog

class PsikologAdapter (private val list: ArrayList<PsikologResponse>): RecyclerView.Adapter<PsikologAdapter.PostViewHolder>(){
        inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(psikologResponse: PsikologResponse) {
                with(itemView){
                    val text = "id: ${psikologResponse.id_psikolog}\n" +
                            "nama: ${psikologResponse.nama_psikolog}\n" +
                            "tahun: ${psikologResponse.tahun_psikolog}\n" +
                            "deskripsi: ${psikologResponse.deskripsi_psikolog}\n"
                    tvPsikolog.text = text
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_psikolog_list, parent, false)
            return PostViewHolder(view)
        }

        override fun getItemCount(): Int = list.size

        override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
            holder.bind(list[position])
        }
    }
