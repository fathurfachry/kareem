package com.fachry.kareem.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.recyclerview.widget.RecyclerView
import com.fachry.kareem.databinding.ActivityAdabBinding
import com.fachry.kareem.databinding.RowItemDoaBinding
import com.fachry.kareem.model.DoaDzikirModel
import com.google.android.gms.ads.mediation.Adapter

class DoaAdapter(private val listDoa: ArrayList<DoaDzikirModel>) :
    RecyclerView.Adapter<DoaAdapter.MyViewHolder>() {

    class MyViewHolder(val binding: RowItemDoaBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val bindingDoaDzikir = RowItemDoaBinding
            .inflate(LayoutInflater.from(parent.context), parent,false)

        return MyViewHolder(bindingDoaDzikir)
    }

    override fun getItemCount(): Int = listDoa.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataDzikirDoa = listDoa[position]

        holder.binding.apply {
            tvTitle.text = dataDzikirDoa.title
            tvLafaz.text = dataDzikirDoa.lafadz
            tvTerjemah.text = dataDzikirDoa.terjemah
        }
    }

}