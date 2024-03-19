package com.example.share2care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.share2care.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
private val binding: ActivityStartBinding by lazy {
    ActivityStartBinding.inflate(layoutInflater)
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.nextButton.setOnClickListener {
            val intent = Intent(this,dashboardActivity::class.java)
            startActivity(intent)
        }


    }
}