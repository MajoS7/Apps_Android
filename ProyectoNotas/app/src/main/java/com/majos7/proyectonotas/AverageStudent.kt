package com.majos7.proyectonotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AverageStudent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_average_student)
        val btnAverage:Button=findViewById(R.id.btnAverage)
        btnAverage.setOnClickListener{onclick()}
    }
    private fun onclick(){
        val intent= Intent(this, InformationStudent::class.java)
        startActivity(intent)
    }
}