package com.majos7.proyectonotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class AverageStudent : AppCompatActivity() {
    var SSubject:StudentSubjects= StudentSubjects()
    var BDStudent:BasicStudentData=BasicStudentData()
    var operaciones:Operations= Operations()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_average_student)

        val btnAdd:Button=findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener{agregarmateria()}
        val btnAverage:Button=findViewById(R.id.btnAverage)
        btnAverage.setOnClickListener{onclick()}
        var miBundle:Bundle?=this.intent.extras

        if (miBundle!=null){
            mensajeTx.text="Hola ${miBundle.getAll("Nombre")}"
        }
    }
    private fun onclick(){
        //val intent= Intent(this, InformationStudent::class.java)
        //startActivity(intent)
        pasarobjectmateria()
    }

    private fun agregarmateria(){
        val txtNameSubjects:EditText=findViewById(R.id.txt_name_subject)
        val txtGrade:EditText=findViewById(R.id.txt_grade)

        SSubject.nameSubject=txtNameSubjects.text.toString()
        SSubject.gradeSubject=txtGrade.text.toString().toDouble()

        operaciones.registerStudent(BDStudent,SSubject)


    }

    private fun pasarobjectmateria(){
        /*val mensaje:TextView=findViewById(R.id.tvwSubjectsGrades)
        var mensajecompleto:String=""
        for (item in operaciones.listStudent){
            mensajecompleto="$mensajecompleto ${item.name}\n "
        }
        mensaje.text="hola mundo"*/



    }
}