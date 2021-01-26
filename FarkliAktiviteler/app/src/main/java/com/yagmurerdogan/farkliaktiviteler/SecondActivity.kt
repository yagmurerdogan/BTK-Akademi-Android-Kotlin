package com.yagmurerdogan.farkliaktiviteler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        val alinanVeri = intent.getStringExtra("yollananVeri")
        textView2.text = "${alinanVeri} Nice To Know You :)"


    }
}