package com.example.share2care.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.share2care.databinding.CartItemBinding
import com.example.share2care.adapter.cartadapter

class cartadapter(
    private val cartItems: MutableList<String>,
    private val cartItemPrice: MutableList<String>,
    private var cartImage: MutableList<Int>
) : RecyclerView.Adapter<cartadapter.CartViewHolder>() {

    private val itemQuantities = IntArray(cartItems.size) { 1 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = cartItems.size

    inner class CartViewHolder(private val binding: CartItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                val quantity = itemQuantities[position]
                cartfoodname.text = cartItems[position]
                cartitemprice.text = cartItemPrice[position]
                cartimage.setImageResource(cartImage[position])
                cartItemquantity.text = quantity.toString()

                minusbutton.setOnClickListener {
                    decreaseQuantity(position)
                    Log.d("CartAdapter", "Minus button clicked at position $position")
                }

                addbutton.setOnClickListener {
                    increaseQuantity(position)
                    Log.d("CartAdapter", "Add button clicked at position $position")
                }

                deletebutton.setOnClickListener {
                    val itemPosition = adapterPosition
                    if (itemPosition != RecyclerView.NO_POSITION) {
                        deleteItem(itemPosition)
                        Log.d("CartAdapter", "Delete button clicked at position $position")
                    }
                }
            }
        }

        private fun increaseQuantity(position: Int) {
            if (itemQuantities[position] < 10) {
                itemQuantities[position]++
                binding.cartItemquantity.text = itemQuantities[position].toString()
            }
        }

        private fun decreaseQuantity(position: Int) {
            if (itemQuantities[position] > 1) {
                itemQuantities[position]--
                binding.cartItemquantity.text = itemQuantities[position].toString()
            }
        }

        private fun deleteItem(position: Int) {
            cartItems.removeAt(position)
            cartImage.removeAt(position)
            cartItemPrice.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, cartItems.size)
        }
    }
}
