package com.example.share2care.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.share2care.R
import com.example.share2care.adapter.Popularadapter
import com.example.share2care.databinding.FragmentHomeBinding
import java.util.Objects


class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner4,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner5,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner6,ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList,ScaleTypes.FIT)
        imageSlider.setItemClickListener(object :ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemPosition = imageList[position]
                val itemMessage="Selected Image $position"
                Toast.makeText(requireContext(),itemMessage,Toast.LENGTH_SHORT).show()
            }
        })

       val foodName = listOf("Rice-plate","veg-thali","Nonveg-thali","Ration-box","Attapackets","Greenvegetables","item")
        val price = listOf("Qty:2","Qty:3","Qty:4","Qty:6","Qty:10","Qty:8","Qty:9")
        val popularfoodimages= listOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.ration,R.drawable.atta,R.drawable.vegpack,R.drawable.menu7)
val adapter = Popularadapter(foodName,price,popularfoodimages)
        binding.popularrecyclerview.layoutManager=LinearLayoutManager(requireContext())
        binding.popularrecyclerview.adapter = adapter

    }
            

    }
