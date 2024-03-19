package com.example.share2care.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.share2care.R
import com.example.share2care.adapter.cartadapter
//import com.example.share2care.adapter.CartAdapter
import com.example.share2care.databinding.FragmentCartBinding
import com.example.share2care.databinding.FragmentProfileBinding


class cartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCartBinding.inflate(inflater,container,false)


        val cartfoodName = listOf("Ration-box","Attapackets","Greenvegeables","Rice-plate","Nonveg-thali","Veg-thali")
        val cartItemPrice = listOf("Qty:2","Qty:3","Qty:8","Qty:6","Qty:7","Qty:8")
        val cartImage = listOf(
            R.drawable.ration,R.drawable.atta,R.drawable.vegpack,R.drawable.menu1,R.drawable.menu3,R.drawable.menu2
        )

        val adapter = cartadapter(ArrayList(cartfoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartrecyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.cartrecyclerview.adapter = adapter

        return binding.root
    }



    companion object {


    }
}
