package com.majos7.calificacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonAverage:Button=findViewById(R.id.btnAverage)
        buttonAverage.setOnClickListener{onClick()}
    }
    private fun onClick(){
        val nameTxt:EditText=findViewById(R.id.txtName)
        val subjectTxt:EditText=findViewById(R.id.txtSubject)
        val nota1Txt:EditText=findViewById(R.id.txtNota1)
        val nota2Txt:EditText=findViewById(R.id.txtNota2)
        val nota3Txt:EditText=findViewById(R.id.txtNota3)


        var nameTx:String=nameTxt.text.toString()
        var subjectTx=subjectTxt.text.toString()
        var txt1Nota:String=nota1Txt.text.toString()
        var txt2Nota:String=nota2Txt.text.toString()
        var txt3Nota:String=nota3Txt.text.toString()

        var average:Float =(txt1Nota.toFloat()+txt2Nota.toFloat()+txt3Nota.toFloat())/3

        val intent=Intent(this,Activity_Date::class.java)
        val miBundle:Bundle= Bundle()
        miBundle.putString("nombre", nameTx)
        miBundle.putString("materia", subjectTx)
        miBundle.putString("nota1", txt1Nota)
        miBundle.putString("nota2", txt2Nota)
        miBundle.putString("nota3", txt3Nota)
        miBundle.putString("promedio", average.toString())
        intent.putExtras(miBundle)
        startActivity(intent)
    }

}