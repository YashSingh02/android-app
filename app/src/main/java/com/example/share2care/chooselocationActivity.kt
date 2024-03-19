package com.example.share2care

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.share2care.databinding.ActivityChooselocationBinding
import com.example.share2care.databinding.ActivityLogin2Binding

class chooselocationActivity : AppCompatActivity() {
    private val binding: ActivityChooselocationBinding by lazy {
        ActivityChooselocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locationList = arrayOf("Mumbai","Delhi","Nagpur","Pune","Bangalore")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView = binding.listofLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}