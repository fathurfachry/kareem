package com.fachry.kareem.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fachry.kareem.MainActivity
import com.fachry.kareem.R
import com.fachry.kareem.adapter.DoaAdapter
import com.fachry.kareem.databinding.ActivityDoaBinding
import com.fachry.kareem.model.DataDoaDzikirModel

class DoaActivity : AppCompatActivity() {

    lateinit var binding: ActivityDoaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconArrowLeft.setOnClickListener {
            startActivity(Intent(this@DoaActivity, MainActivity::class.java))
        }

        binding.apply {
            rvDoa.layoutManager = LinearLayoutManager(this@DoaActivity)
            rvDoa.adapter = DoaAdapter(DataDoaDzikirModel.listDoa)
        }

    }
}