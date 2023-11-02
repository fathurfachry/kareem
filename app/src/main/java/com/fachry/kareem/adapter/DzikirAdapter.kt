package com.fachry.kareem.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fachry.kareem.databinding.RowItemDoaBinding
import com.fachry.kareem.databinding.RowItemDzikirBinding
import com.fachry.kareem.model.DoaDzikirModel

class DzikirAdapter(private val listDzikir: ArrayList<DoaDzikirModel>) :
    RecyclerView.Adapter<DzikirAdapter.MyViewHolder>() {

    class MyViewHolder(val binding: RowItemDzikirBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val bindingDzikir = RowItemDzikirBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return MyViewHolder(bindingDzikir)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataDzikirDoa = listDzikir[position]

        holder.binding.apply {
            tvTitle.text = dataDzikirDoa.title
            tvLafaz.text = dataDzikirDoa.lafadz
            tvTerjemah.text = dataDzikirDoa.terjemah
        }
    }

    override fun getItemCount(): Int = listDzikir.size
}