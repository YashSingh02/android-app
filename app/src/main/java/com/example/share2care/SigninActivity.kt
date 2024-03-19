package com.example.share2care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.share2care.databinding.ActivityLogin2Binding
import com.example.share2care.databinding.ActivitySigninBinding

class SigninActivity : AppCompatActivity() {
    private val binding: ActivitySigninBinding by lazy {
        ActivitySigninBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.alreadyhaveaccountbutton.setOnClickListener {
            val intent= Intent(this,LoginActivity2::class.java)
            startActivity(intent)
        }
//        binding.createaccountbutton.setOnClickListener {
//            // Navigate to chooselocationActivity when "create account" button is clicked
//            val intent = Intent(this, chooselocationActivity::class.java)
//            startActivity(intent)
//        }

        binding.createaccountbutton.setOnClickListener {
            // Navigate to chooselocationActivity when "create account" button is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    }

