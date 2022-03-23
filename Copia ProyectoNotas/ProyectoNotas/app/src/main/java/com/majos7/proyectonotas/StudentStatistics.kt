package com.majos7.proyectonotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StudentStatistics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_statistics)
        val btnClose:Button=findViewById(R.id.btnClose)
        btnClose.setOnClickListener{onclick()}
    }
    private fun onclick(){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}