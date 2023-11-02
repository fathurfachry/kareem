package com.fachry.kareem.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fachry.kareem.MainActivity
import com.fachry.kareem.R
import com.fachry.kareem.adapter.DoaAdapter
import com.fachry.kareem.adapter.SunnahAdapter
import com.fachry.kareem.databinding.ActivityDoaBinding
import com.fachry.kareem.databinding.ActivitySunnahBinding
import com.fachry.kareem.model.DataAdabSunnahModel
import com.fachry.kareem.model.DataDoaDzikirModel

class SunnahActivity : AppCompatActivity() {

    lateinit var binding: ActivitySunnahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySunnahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconArrowLeft.setOnClickListener {
            startActivity(Intent(this@SunnahActivity, MainActivity::class.java))
        }

        binding.apply {
            rvSunnah.layoutManager = LinearLayoutManager(this@SunnahActivity)
            rvSunnah.adapter = SunnahAdapter(DataAdabSunnahModel.listSunnah)
        }

    }
}