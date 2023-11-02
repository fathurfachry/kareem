package com.fachry.kareem.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.recyclerview.widget.RecyclerView
import com.fachry.kareem.databinding.ActivityAdabBinding
import com.fachry.kareem.databinding.RowItemDoaBinding
import com.fachry.kareem.databinding.RowItemSunnahBinding
import com.fachry.kareem.model.AdabSunnahModel
import com.fachry.kareem.model.DoaDzikirModel
import com.google.android.gms.ads.mediation.Adapter

class SunnahAdapter(private val listSunnah: ArrayList<AdabSunnahModel>) :
    RecyclerView.Adapter<SunnahAdapter.MyViewHolder>() {

    class MyViewHolder(val binding: RowItemSunnahBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val bindingSunnah = RowItemSunnahBinding
            .inflate(LayoutInflater.from(parent.context), parent,false)

        return MyViewHolder(bindingSunnah)
    }

    override fun getItemCount(): Int = listSunnah.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataSunnah = listSunnah[position]

        holder.binding.apply {
            tvTitle.text = dataSunnah.title
            tvContent.text = dataSunnah.content
        }
    }

}