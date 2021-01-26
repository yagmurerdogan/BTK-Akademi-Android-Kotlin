package com.yagmurerdogan.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Merhaba Kotlin!")
        println(5*10)

        //Değişkenler && Sabitler
        var a = 5
        var b = 10
        println (a * b)
        var yas = 50 // degisken tanımlama yaptık variabledan geliyor
        println(yas / 5 * 8)
        yas = 60 //degisken degerini değiştirdik
        println(yas / 5* 8)

        val x = 10 //sabit tanımlama valuedan geliyor
        val y = 20
        println(x+y)

        //camelCase
        //snake_case

        val yasSonucu = yas * x
        println(yasSonucu)

        println("-------Int-------") //32 bit

        val benimIntegerim : Int // tanımlama defining
        benimIntegerim = 5 //Initializing

        var yeniInteger : Int = 20

        println(benimIntegerim/2) //2.5 olmasıs gerekirken 2 gösterir çünkü int tipinde

        println("-------Long-------") //64 bit
        var benimLong : Long = 100
        benimLong = 300000000
        println(benimLong)

        println("-------Double & Float-------") //64 & 32 bit
           val pi : Double = 3.14
        println(pi * 2) //sonuç ondalıklı sayı olur

        val floatPi : Float = 3.14f
        println(floatPi * 2)

        val yeniDouble = 5.0
        println(yeniDouble / 2) //sonuç ondalıklı olur

        println("-------String-Metin-------")
        val benimString = "Benim Yeni Metnim"
        println(benimString.length)

        val isim = "Atıl"
        val soyisim = "Samancıoğlu"
        val tamisim = isim + " " + soyisim
        println(tamisim)

        val yeniBirString : String
        yeniBirString = "10"
        val baskaBirString = "20"
        println(yeniBirString + baskaBirString) //sonuç string olur yan yana yazar

        println("-------Boolean-------")
        var benimBoolean = true
        benimBoolean = false
        println(3<5) //true
        println(4!=4) //false

        println("-------Veri Tipi Dönüştürme-------")
        var benimInt = 10
        var benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        var kullaniciGirdisi = "50"
        var kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt/2)

        println("-------Diziler-------") //array dizi
        val stringOrnegi = "Atıl"
        val benimDizim = arrayOf(stringOrnegi, "Samancıoğlu", "Yağmur", "Erdoğan")
        //diziler index mantığı ile çalışır ve index 0'dan başlar
        println(benimDizim[0])
        println(benimDizim.get(0))
        println(benimDizim[2]) // yağmur yazar
        benimDizim[2] = "Mahmut"
        println(benimDizim.get(2)) // mahmut yazar

        benimDizim.set(3,"Mehmet")

        val numaraDizisi = doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Atıl", 24,16.5,true)
        println(karisikDizi.get(3))

        println("-------ArrayList-------") //arraylist listeler
        val isimListesi = arrayListOf<String>("Atıl","Yağmur","Zehra")
        println(isimListesi.get(1))
        isimListesi.add("Mehmet")
        isimListesi.add("Berkcan")
        println(isimListesi.get(4))

        val  karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add("Atıl")
        karisikArrayList.add(5)
        karisikArrayList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))


        println("-------Set-------") //aynı veriden sadece bir tane barındırır
        val ornekDizi = arrayOf(7,8,9,9,9,8,10) //dizide tekrarlama var
        println("index 2: ${ornekDizi[2]}") // 9 yazar
        println("index 2: ${ornekDizi[3]}") // 9 yazar
        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)
        println(benimSet.size) //4 yazar
        //For each
        benimSet.forEach {
            println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Samancıoğlu")

        digerSet.forEach{
            println(it)
        }

        println("-------Map-------") //son koleksiyon
        //Key-Value Pairing
        //şimdiye kadarki bilgilerimizle şu şekilde yapabiliriz;
        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,300,200)
        println("${yemekDizisi[0]}'nın kalorisi: ${kaloriDizisi[0]}")
        //ancak eleman sayısı arttıkça bu dizi kullanımı zorlaşmaktadır

        val yemekKaloriMap = hashMapOf<String,Int>()
        yemekKaloriMap.put("Elma", 100)
        yemekKaloriMap.put("Et",300)
        yemekKaloriMap.put("Tavuk",200)
        println(yemekKaloriMap.get("Et"))


        val benimMapim = HashMap<String,String> ()
        benimMapim.put("Örnek","Değer")

        val yeniMap = hashMapOf<String, Int>("Atıl" to 40, "Örnek" to 50)


        println("-------Matematiksel İşlemler-------")
        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi = 10
        println(digerSayi > sayi) // sonuç true
        //&& - ve || - veya
        println(digerSayi > sayi && 2 > 3) //false
        println(digerSayi > sayi || 2 > 3) //true

        println(8+7)
        println(10-4)
        println(20*5)
        println(10/2)

        //remainder - kalanı bulmak
        println(10%2) // sonuç 0

        println("-------If Statements (Eğer Kontrolleri)-------")
        val skor = 29
        if(skor < 10) {
            println("Oyunu kaybettin!")
        } else if (skor >= 10 && skor < 20) {
            println("Skorun 10 ve 20 arasında, çok iyi skor aldın!")
        } else if (skor >= 20 && skor < 30) {
            println("Skorun 20 ve 30 arasında, rekorlar kırıyorsun!")
        } else {
            println("Skorun 30'un üzerinde, sen efsanesin!")
        }

        println("-------When (Switch gibi)-------")
//        var notRakami = 0
//        var notStringi = ""
//        if (notRakami == 0) {
//            notStringi = "Geçersiz Not"
//        } else if (notRakami == 1) {
//            notStringi = "Zayıf"
//        }else if (notRakami == 2) {
//            notStringi = "Kötü"
//        }else if (notRakami == 3) {
//            notStringi = "Orta"
//        }else if (notRakami == 4) {
//            notStringi = "İyi"
//        }else {
//            notStringi = "Pekiyi"
//        }
//
//        println(notStringi)

        //aynısını when ile yapalım

        var notRakami = 3
        var notStringi = ""
        when(notRakami) {
            0 -> notStringi = "Geçersiz Not"
            1 -> notStringi = "Zayıf"
            2 -> notStringi = "Kötü"
            3 -> notStringi = "Orta"
            4 -> notStringi = "İyi"
            else -> notStringi = "Pekiyi"
        }
        println(notStringi)

        println("-------Döngüler (1.For Döngüsü)-------")
        val baskaBirDizi = arrayOf(5,10,15,20,25,30)
        val q = baskaBirDizi[0] / 5 + 3
        println(q)
        println("Döngü Başladı")
        for (num in baskaBirDizi) {
            println(num / 5 + 3)
        }
        println("Döngü Bitti")

        for (indeks in baskaBirDizi.indices) {
            println(baskaBirDizi[indeks] / 5 + 3)
        }

        for ( b  in 0..9) {
            println(b)
        }

        val benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Yağmur")
        benimDigerStringDizim.add("Erdoğan")

        for (str in benimDigerStringDizim) {
            println(str)
        }

        benimDigerStringDizim.forEach{
            println(it)
        }

        println("-------Döngüler (2.While Döngüsü)-------")

        var j = 0

        while (j < 10) {
            println(j)
            j = j + 1
        }
    }
}