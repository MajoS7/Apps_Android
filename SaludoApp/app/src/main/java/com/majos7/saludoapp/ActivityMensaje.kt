package com.majos7.saludoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMensaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)
        val mensajeTx=findViewById<TextView>(R.id.txtMensaje)

        var miBundle:Bundle?=this.intent.extras

        if (miBundle!=null){
            mensajeTx.text="Hola ${miBundle.getString("Nombre")}"
        }
        val botonSalir:Button=findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener{onClick()}
    }
    private fun onClick(){
        finish()
    }
}