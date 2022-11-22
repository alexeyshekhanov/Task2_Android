package com.example.layouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemCartAdapter(generateList())

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