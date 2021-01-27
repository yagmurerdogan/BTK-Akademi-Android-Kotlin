package com.yagmurerdogan.kullaniciadisaklama

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences : SharedPreferences
    var gettedUserName : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SharedPreferences

        sharedPreferences = this.getSharedPreferences("com.yagmurerdogan.kullaniciadisaklama", Context.MODE_PRIVATE)
        gettedUserName = sharedPreferences.getString("userNameKey","")

        if (gettedUserName != null) {
            textView.text = "Saved Name: ${gettedUserName}"
        }
    }

    fun save(view : View){
        val userName = editText.text.toString()
        if(userName ==""){
            Toast.makeText(this,"Please write your name!", Toast.LENGTH_LONG).show()
        } else {
            sharedPreferences.edit().putString("userNameKey",userName).apply()
            textView.text = "Saved Name: ${userName}"
        }
    }

    fun delete(view : View){

        gettedUserName = sharedPreferences.getString("userNameKey","")
        if (gettedUserName != null) {
            textView.text = "Saved Name: "
            sharedPreferences.edit().remove("userNameKey").apply()
        }

    }
}