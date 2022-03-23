package com.majos7.proyectonotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class BasicData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_data)
        val btnFollowing:Button=findViewById(R.id.btnFollowing)
        btnFollowing.setOnClickListener{onclick()}

    }
    private fun onclick(){
        val txtDocument:EditText=findViewById(R.id.txt_document)
        val txtName:EditText=findViewById(R.id.txt_name)
        val txtAge:EditText=findViewById(R.id.txt_age)
        val txtPhone:EditText=findViewById(R.id.txt_phone)
        val txtAddress:EditText=findViewById(R.id.txt_address)

        var BDStudent:BasicStudentData=BasicStudentData()

        BDStudent.document=txtDocument.text.toString()
        BDStudent.name=txtName.text.toString()
        BDStudent.age=txtAge.text.toString().toInt()
        BDStudent.phone=txtPhone.text.toString()
        BDStudent.address=txtAddress.text.toString()

        val intent= Intent(this, AverageStudent::class.java)
        val miBundle:Bundle= Bundle()
        miBundle.putAll("prueba",BDStudent)
        intent.putExtras(miBundle)
        //val miBundle:Bundle= Bundle()
        //miBundle.putString("Nombre",nombre)
        //intent.putExtras(miBundle)
        startActivity(intent)

    }

}