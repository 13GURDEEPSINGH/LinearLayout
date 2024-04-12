package com.gurdeep.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.gurdeep.linearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding?.btnsubmit?.setOnClickListener {
            if (binding.etname.text.isEmpty()) {
                binding.etname.error = "enter your name"
            } else if (binding.etaboutcollege.text.isEmpty()) {
                binding.etaboutcollege?.error = "enter your college"
            } else {
                System.out.println("login")


            }
        }

