package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

//        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
        val itemList = listOf(
            ItemList("Ferrari", "Deskripsi 1", "https://img4.icarcdn.com/865311/prev-desktop_harga-mobil-ferrari-ini-di-indonesia-rp-16-miliar-siapa-mau-beli_cover_2020_ferrari-488-pista-di-indonesia-dijual-rp-16-miliar-2020-2.jpg"),
            ItemList("", "Deskripsi 2", "https://cdn.motor1.com/images/mgl/JYbWM/s3/lamborghini-huracan-evo-feature.jpg"),
            ItemList("judul 3", "Deskripsi 3", "https://cdn0-production-images-kly.akamaized.net/NkwD9ZoKdO4Cvk8LEEsUnuSYbfQ=/750x0/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3981549/original/039518500_1648785174-IMG_20220401_104450.jpg")

        )
        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter

    }
}