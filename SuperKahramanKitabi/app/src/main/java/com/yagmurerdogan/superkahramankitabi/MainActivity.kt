package com.yagmurerdogan.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veri Hazırlığı

        var superKahramanIsımleri = ArrayList<String>()
        superKahramanIsımleri.add("Batman")
        superKahramanIsımleri.add("Superman")
        superKahramanIsımleri.add("Iron Man")
        superKahramanIsımleri.add("Aquaman")
        superKahramanIsımleri.add("Spiderman")

        //verimsiz tanımlamalar

        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ironman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.aquaman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)

        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)

        //Adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager


        val adapter = RecyclerAdapter(superKahramanIsımleri,superKahramanGorselleri)
        recyclerView.adapter = adapter

    }
}