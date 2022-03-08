package com.majos7.saludoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miBoton:Button= findViewById(R.id.btSaludar)

        miBoton.setOnClickListener{onClick(1)}

        val miBoton2:Button=findViewById(R.id.btSaludar2)
        miBoton2.setOnClickListener{onClick(2)}
    }

    private fun onClick(boton:Int){
        val campotexto:EditText= findViewById(R.id.input)
        var nombre:String = campotexto.text.toString()

        when(boton){
            1->{
                Toast.makeText(this,"Bienvenido $nombre",Toast.LENGTH_LONG).show()
                val saludotx:TextView=findViewById(R.id.txSaludo)
                saludotx.text="Bienvenido $nombre"
            }
            2->{
                val intent=Intent(this,ActivityMensaje::class.java)
                val miBundle:Bundle= Bundle()
                miBundle.putString("Nombre",nombre)
                intent.putExtras(miBundle)
                startActivity(intent)
            }
        }



    }
}

