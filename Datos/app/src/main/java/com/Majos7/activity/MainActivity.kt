package com.Majos7.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSave:Button= findViewById(R.id.btSave)
        buttonSave.setOnClickListener{btSaveOnClick()}
    }
    private fun btSaveOnClick(){
        val txname:EditText=findViewById(R.id.name)
        val txAdress:EditText=findViewById(R.id.address)
        val txEmail:EditText=findViewById(R.id.email)
        val txPhone:EditText=findViewById(R.id.phone)
        val txAge:EditText=findViewById(R.id.age)
        val txmessage: TextView =findViewById(R.id.message)

        var nametx:String=txname.text.toString()
        var adressTx:String=txAdress.text.toString()
        var emailTx:String=txEmail.text.toString()
        var phoneTx:String=txPhone.text.toString()
        var ageTx:String=txAge.text.toString()

        if(ageTx.toByte()>=0 && ageTx.toByte()<=15){
            Toast.makeText(this,"Infante",Toast.LENGTH_LONG).show()
        }
        else if(ageTx.toByte()>=16 && ageTx.toByte()<=18){
            Toast.makeText(this,"Adolescente",Toast.LENGTH_LONG).show()
        }
        else if(ageTx.toByte()>=19 && ageTx.toByte()<=65){
            Toast.makeText(this,"Adulto",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this,"Adulto Mayor",Toast.LENGTH_LONG).show()
        }
        txmessage.text="Nombre: $nametx\nDireccion: $adressTx\nEmail: $emailTx\nTelefono: $phoneTx\nEdad: $ageTx"
    }


}