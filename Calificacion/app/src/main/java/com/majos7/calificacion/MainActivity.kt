package com.majos7.calificacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonAverage:Button=findViewById(R.id.btnAverage)
        buttonAverage.setOnClickListener{onClick()}
    }
    private fun onClick(){
        val nota1Txt:EditText=findViewById(R.id.txtNota1)
        val nota2Txt:EditText=findViewById(R.id.txtNota2)
        val nota3Txt:EditText=findViewById(R.id.txtNota3)

        var txt1Nota:String=nota1Txt.toString()
        var txt2Nota:String=nota2Txt.toString()
        var txt3Nota:String=nota3Txt.toString()

        var average:Float =(txt1Nota.toFloat()+txt2Nota.toFloat()+txt3Nota.toFloat())/3





        val intent=Intent(this,Activity_Date::class.java)
        val miBundle:Bundle= Bundle()
        miBundle.putString("nota1", txt1Nota)
        intent.putExtras(miBundle)
        startActivity(intent)
    }

}