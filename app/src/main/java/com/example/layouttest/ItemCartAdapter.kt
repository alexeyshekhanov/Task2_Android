package com.example.layouttest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ItemCartAdapter(private val dataSet: List<ItemCart>): RecyclerView.Adapter<ItemCartAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tvProductName: TextView
        val tvProductPrice: TextView
        val imageView: ImageView
        val tvStock: TextView
        val tvQuantity: TextView
        val imageView2: ImageView

        init{
            tvProductName = view.findViewById(R.id.productName)
            tvProductPrice = view.findViewById(R.id.productPrice)
            imageView = view.findViewById(R.id.imageView)
            tvStock = view.findViewById(R.id.stock)
            tvQuantity = view.findViewById(R.id.quantity)
            imageView2 = view.findViewById(R.id.imageView2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cart, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            Glide.with(imageView.context).load(dataSet[position].imageUrl).into(imageView)
            Glide.with(imageView2.context).load(dataSet[position].imageCross).into(imageView2)
            tvProductName.text = dataSet[position].productName
            tvProductPrice.text = String.format("%s roubles", dataSet[position].price.toString())
            tvStock.text = dataSet[position].stock
            tvQuantity.text = String.format("Quantity: %s", dataSet[position].quantity.toString())
        }
    }

    override fun getItemCount(): Int = dataSet.size

}