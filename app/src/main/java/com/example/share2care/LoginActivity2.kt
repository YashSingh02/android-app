package com.example.share2care

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.share2care.databinding.ActivityLogin2Binding
import android.content.Intent

class LoginActivity2 : AppCompatActivity() {
    private val binding:ActivityLogin2Binding by lazy {
        ActivityLogin2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.loginbutton.setOnClickListener {
            val intent=Intent(this,SigninActivity::class.java)
            startActivity(intent)
        }
        binding.donthavebutton.setOnClickListener {
            val intent=Intent(this,SigninActivity::class.java)
            startActivity(intent)
        }
    }
}