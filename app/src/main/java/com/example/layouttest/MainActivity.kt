package com.example.layouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val listOfPurchases = generateList()
        recyclerView.adapter = ItemCartAdapter(listOfPurchases)

        val shippingCost = 3500.0

        var currentTextView  = findViewById<TextView>(R.id.shippingCost)
        currentTextView.setText(String.format("%.2f", shippingCost))

        currentTextView  = findViewById<TextView>(R.id.subtotalCost)
        var subtotal = 0.0
        var itemsInCart = 0
        for (item in listOfPurchases) {
            subtotal += item.price * item.quantity
            itemsInCart += item.quantity

        }
        currentTextView.setText(String.format("%.2f", subtotal))

        findViewById<TextView>(R.id.taxCost).setText(String.format("%.2f", subtotal * 0.12))
        //String.format("%.3f", x)

        findViewById<TextView>(R.id.totalCost).setText(String.format("%.2f", subtotal + shippingCost))


        findViewById<TextView>(R.id.textViewAtTop).setText(String.format("%d items in your cart", itemsInCart))



    }
    private fun generateList(): List<ItemCart> =
        listOf(
            ItemCart(
                imageUrl = "https://img.mvideo.ru/Big/30062384bb.jpg",
                productName = "Smartphone Xiaomi Redmi Note 11 4GB/128GB Twilight Blue",
                price = 14999.0,
                stock = "In stock",
                quantity = 1
            ),
            ItemCart(
                imageUrl = "https://img.mvideo.ru/Big/30062036bb.jpg",
                productName = "Smartphone Tecno Spark 8с 4/64GB Magnet Black",
                price = 6999.0,
                stock = "In stock",
                quantity = 2
            ),
            ItemCart(
                imageUrl = "https://img.mvideo.ru/Big/30063236bb.jpg",
                productName = "Smartphone Apple iPhone 11 128GB Black",
                price = 42999.0,
                stock = "Last 1 left",
                quantity = 1
            ),
            ItemCart(
                imageUrl = "https://img.mvideo.ru/Big/30058844bb.jpg",
                productName = "Smartphone Realme GT Master Edition 8 256GB Voyager Grey (RMX3363)",
                price = 24999.0,
                stock = "In stock",
                quantity = 3
            )
        )
}