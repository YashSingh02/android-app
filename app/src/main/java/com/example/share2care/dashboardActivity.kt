package com.example.share2care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.share2care.databinding.ActivityDashboardBinding

class dashboardActivity : AppCompatActivity() {

    private val binding:ActivityDashboardBinding by lazy{
        ActivityDashboardBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recieverDash.setOnClickListener{
            val intent= Intent(this,LoginActivity2::class.java)
            startActivity(intent)

        }
    }
}