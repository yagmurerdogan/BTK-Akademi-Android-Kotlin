package com.yagmurerdogan.contextprojesi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast, Alert
        //applicationContext -> app context
        //this, this@MainActivity

        Toast.makeText(this,"Welcome!",Toast.LENGTH_LONG).show()
    }

    fun showMessage (view : View) {
        val alertMessage = AlertDialog.Builder(this@MainActivity)
        alertMessage.setTitle("Character Error !")
        alertMessage.setMessage("Are you a Heartbreaker ? ")
        alertMessage.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Fuck Off! You can't join.",Toast.LENGTH_LONG).show()
        })

        alertMessage.setNegativeButton("No") {dialogInterface, i ->
        Toast.makeText(this,"Okay Sweetie :) ",Toast.LENGTH_LONG).show()}

        alertMessage.show()
    }


}