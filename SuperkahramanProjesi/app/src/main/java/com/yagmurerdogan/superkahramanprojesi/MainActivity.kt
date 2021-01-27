package com.yagmurerdogan.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numara = 0
    private var isim = ""
    private var yas : Int? = null
    private var meslek = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Scope - kapsam
        numara = 5
    }

    fun superKahramanYap(view : View){
        numara = 10

//        val isim = isimText.text.toString()
//        val yas = yasText.text.toString().toIntOrNull()
//        val meslek = meslekText.text.toString()

        isim = isimText.text.toString()
        yas = yasText.text.toString().toIntOrNull()
        meslek = meslekText.text.toString()

        if(yas == null) {
            sonucText.text = "Doğru Yaşı Giriniz"
        }else{
            val superkahraman = SuperKahraman(isim,yas!!,meslek)

            sonucText.text = "İsim: ${superkahraman.isim} Yas: ${superkahraman.yas} Meslek: ${superkahraman.meslek}"
        }

    }
}