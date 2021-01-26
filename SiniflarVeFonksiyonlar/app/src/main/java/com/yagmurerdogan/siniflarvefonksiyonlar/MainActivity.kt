package com.yagmurerdogan.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var j = 0
        if (j == 0) {
            ilkFonksiyon()
        } else {
            ikinciFonksiyon()
        }

        cikarma(500,20) //bir şey döndürmez
        var x = toplama(10,20) //int döndürür
        textView.text = "Sonuc: ${x}"

        button.setOnClickListener{
            val toplamaSonucu = toplama(10,50)
            textView.text = "Sonuc: ${toplamaSonucu}"
        }

        sinifCalismasi()
        nullGuvenligi()

    }

    //fonksiyonlar kod bloğudur ancak fonksiyonun tek amacı kod bloğu oluşturmak değildir
    //fonksiyonlar girdiler alıp çıktılar verebilir

    fun ilkFonksiyon() {
        println("İlk fonksiyon çalıştırıldı.")
    }

    fun ikinciFonksiyon() {
        println("İkinci fonksiyon çalıştırıldı.")
    }

    //Girdi almak

    fun cikarma(x: Int, y: Int) {
        textView.text = "Sonuc: ${x-y}"
    }

    //Çıktı döndürmek (Return)

    fun toplama(a: Int, b: Int) : Int {
        return a + b
    }

//    fun degistir(view : View){
//        val toplamaSonucu = toplama(10,50)
//        textView.text = "Sonuc: ${toplamaSonucu}"
//    }

    fun sinifCalismasi() {
//        var superman = Superkahraman()
//        superman.isim = "Superman"
//        superman.meslek = "Gazeteci"
//        superman.yas = 20
//
//        var batman = Superkahraman()
//        batman.isim = "Batman"
//        batman.meslek = "Asker"
//        batman.yas = 19
//
//        textView.text = "Yaş: ${superman.yas}"

        var superman = Superkahraman("Superman", 50,"Gazeteci")
        textView.text = "Yaş: ${superman.yas}"
        superman.testFonksiyonu()
        //superman.sacininRengi = "Yeşil" private olduğu için artık değiştirilemez
        println(superman.sacRenginiAl())
    }

    fun nullGuvenligi(){
        //Null, Nullability, Null Safety

        //Tanımlama, Defiening
        var benimString : String?

        //Inıtıalizaztion
        benimString = "Atıl"

        var benimYasim : Int? = null
        println(benimYasim) //null görünür

        benimYasim = 2
        //1

        if(benimYasim != null){
            println(benimYasim * 2)
        } else {
            println("null geldi")
        }

        //2

        // !! -> null olmayacak, ? -> null olabilir
        println(benimYasim.minus(2))

        //3
        //elvis operatörü

        val sonuc = benimYasim?.minus(2) ?: 10
        println(sonuc)

        //4
        //let

        //benimYasim = 5
        benimYasim?.let {
            println(it * 5)
        }

    }
}