package com.majos7.calificacion

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity_Date : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)

        val studentData:TextView=findViewById(R.id.dataStudent)
        val status:TextView=findViewById(R.id.txtstatus)

        var miBundle:Bundle?=this.intent.extras
        if(miBundle!=null){
            studentData.text="Nombre: ${miBundle.getString("nombre")}\nMateria: ${miBundle.getString("materia")}\nNota 1: ${miBundle.getString("nota1")}\nNota 2: ${miBundle.getString("nota2")}\nNota 3: ${miBundle.getString("nota3")}\nPromedio: ${miBundle.getString("promedio")}\nEstado:"
            if(miBundle.getString("promedio")!!.toFloat()>=3.5){
                status.text="Aprobo"
                status.setTextColor(Color.parseColor("#008000"))
            }
            else{
                status.text="Reprobo"
                status.setTextColor(Color.parseColor("#FF0000"))
            }
        }

        val btnSalir:Button=findViewById(R.id.btnSalir)
        btnSalir.setOnClickListener{onclick()}
    }
    private fun onclick(){
        finish()
    }
}