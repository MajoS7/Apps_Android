package com.majos7.practicacontrolesbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivtyMensaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activty_mensaje)
        val mensajeTx=findViewById<TextView>(R.id.txtMensaje)

        var miBundle:Bundle?=this.intent.extras

        if (miBundle!=null){
            mensajeTx.text=miBundle.getString("Datos")
        }
        val botonSalir: Button =findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener{onClick()}
    }
    private fun onClick(){
        finish()
    }

}