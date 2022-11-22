package com.example.layouttest

data class ItemCart(
    val imageUrl: String,
    val productName: String,
    val price: Double,
    val stock: String,
    val quantity: Int,
    val imageCross : String = "https://phonoteka.org/uploads/posts/2022-09/1663703953_2-phonoteka-org-p-krest-bez-fona-pinterest-2.jpg"
)