package com.fachry.kareem.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fachry.kareem.MainActivity
import com.fachry.kareem.R
import com.fachry.kareem.adapter.AdabAdapter
import com.fachry.kareem.adapter.DoaAdapter
import com.fachry.kareem.adapter.SunnahAdapter
import com.fachry.kareem.databinding.ActivityAdabBinding
import com.fachry.kareem.databinding.ActivityDoaBinding
import com.fachry.kareem.databinding.ActivitySunnahBinding
import com.fachry.kareem.model.DataAdabSunnahModel
import com.fachry.kareem.model.DataDoaDzikirModel

class AdabActivity : AppCompatActivity() {

    lateinit var binding: ActivityAdabBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconArrowLeft.setOnClickListener {
            startActivity(Intent(this@AdabActivity, MainActivity::class.java))
        }

        binding.apply {
            rvAdab.layoutManager = LinearLayoutManager(this@AdabActivity)
            rvAdab.adapter = AdabAdapter(DataAdabSunnahModel.listAdab)
        }

    }
}