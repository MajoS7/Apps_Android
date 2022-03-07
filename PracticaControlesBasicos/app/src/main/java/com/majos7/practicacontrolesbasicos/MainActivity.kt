package com.majos7.practicacontrolesbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSave:Button=findViewById(R.id.btSave)
        buttonSave.setOnClickListener{btSaveOnclick()}
    }

    private fun btSaveOnclick(){
        val nameLastname:EditText=findViewById(R.id.txnameLastname)
        val phone:EditText=findViewById(R.id.txphone)
        val email:EditText=findViewById(R.id.txemail)

        val nameLastnametx:String=nameLastname.text.toString()
        val phonetx:String=phone.text.toString()
        val emailtx:String=email.text.toString()


        val genderRg:RadioGroup=findViewById(R.id.rgGender)
        var gender:String=if(genderRg.getCheckedRadioButtonId()==R.id.rbMale){
            "Masculino"
        }
        else if (genderRg.getCheckedRadioButtonId()==R.id.rbFemale){
            "Femenino"
        }
        else{
            "No especifica"
        }



        val socialNetworks:CheckBox=findViewById(R.id.cbSocialNetworks)
        val videoGames:CheckBox=findViewById(R.id.cbVideoGames)
        val programming:CheckBox=findViewById(R.id.cbProgramming)
        val database:CheckBox=findViewById(R.id.cbDatabase)

        var topicsInterest:String=""
        if (socialNetworks.isChecked()){ topicsInterest=topicsInterest+"\n\t"+socialNetworks.text.toString()}
        if (videoGames.isChecked()){ topicsInterest=topicsInterest+"\n\t"+videoGames.text.toString() }
        if (programming.isChecked()){ topicsInterest=topicsInterest+"\n\t"+programming.text.toString() }
        if (database.isChecked()){ topicsInterest=topicsInterest+"\n\t"+database.text.toString() }
        if (topicsInterest==""){topicsInterest="No especifica"}


        val rsave:ToggleButton=findViewById(R.id.tbSave)
        if(rsave.text.toString()=="Si"){
            Toast.makeText(this,"Nombre: $nameLastnametx\nTelefono Celular: $phonetx\nCorreo electronico: $emailtx\nGenero: $gender\nTemas de Interes: $topicsInterest",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this,"Contacto Almacenado",Toast.LENGTH_LONG).show()
        }
    }


}