package com.majos7.saludoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miBoton:Button= findViewById(R.id.btSaludar)

        miBoton.setOnClickListener{onClick()}
    }

    private fun onClick(){
        val campotexto:EditText= findViewById(R.id.input)
        var nombre:String = campotexto.text.toString()
        Toast.makeText(this,"Bienvenido $nombre",Toast.LENGTH_LONG).show()

    }
}

