package com.majos7.proyectonotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BasicData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_data)

        val btnFollowing:Button=findViewById(R.id.btnFollowing)
        btnFollowing.setOnClickListener{onclick()}
    }
    private fun onclick(){
        val intent= Intent(this, AverageStudent::class.java)
        startActivity(intent)
    }
}