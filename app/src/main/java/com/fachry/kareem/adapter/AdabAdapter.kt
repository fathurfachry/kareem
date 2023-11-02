package com.fachry.kareem.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.recyclerview.widget.RecyclerView
import com.fachry.kareem.databinding.ActivityAdabBinding
import com.fachry.kareem.databinding.RowItemAdabBinding
import com.fachry.kareem.model.AdabSunnahModel
import com.google.android.gms.ads.mediation.Adapter

class AdabAdapter(private val listAdab: ArrayList<AdabSunnahModel>) :
    RecyclerView.Adapter<AdabAdapter.MyViewHolder>() {

    class MyViewHolder(val binding: RowItemAdabBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val bindingAdab = RowItemAdabBinding
            .inflate(LayoutInflater.from(parent.context), parent,false)

        return MyViewHolder(bindingAdab)
    }

    override fun getItemCount(): Int = listAdab.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataAdab = listAdab[position]

        holder.binding.apply {
            tvTitle.text = dataAdab.title
            tvContent.text = dataAdab.content
        }
    }

}