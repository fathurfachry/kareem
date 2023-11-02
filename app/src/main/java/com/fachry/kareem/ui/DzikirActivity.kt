package com.fachry.kareem.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fachry.kareem.MainActivity
import com.fachry.kareem.R
import com.fachry.kareem.adapter.DzikirAdapter
import com.fachry.kareem.databinding.ActivityDoaBinding
import com.fachry.kareem.databinding.ActivityDzikirBinding
import com.fachry.kareem.model.DataDoaDzikirModel

class DzikirActivity : AppCompatActivity() {

    lateinit var binding: ActivityDzikirBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconArrowLeft.setOnClickListener {
            startActivity(Intent(this@DzikirActivity, MainActivity::class.java))
        }

        binding.apply {
            rvDzikir.layoutManager = LinearLayoutManager(this@DzikirActivity)
            rvDzikir.adapter = DzikirAdapter(DataDoaDzikirModel.listDzikir)
        }

    }
}