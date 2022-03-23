package com.majos7.proyectonotas

import android.util.Log

class Operations {
    var listStudents =arrayListOf<DataStudent>()

    fun registerStudents(DS: DataStudent){
        listStudents.add(DS)
    }

    fun imprimirListaEstudiantes(){
        for(est in listStudents){
            Log.i("PRUEBA",est.name)
        }
    }

    fun calculateAverage(DS: DataStudent): Double {

        var avg=(DS.grade1+DS.grade2+DS.grade3+DS.grade4+DS.grade5)/5

        return avg
    }

    fun statusStudent(DS: DataStudent):String{
        var StudentStatus=""
        if(DS.average>3.5){
            StudentStatus="Gano"
        }
        else if(DS.average>2.5){
            StudentStatus="Puede Recuperar"
        }
        else{
            StudentStatus="Perdio, no tiene posibilidad de recuperar"
        }
        return StudentStatus
    }

    fun validatornum(num:Double):Boolean{ return num in 0.0..5.0
    }

    fun validatorgrades(DS: DataStudent):Boolean{
        return validatornum(DS.grade1)===true && validatornum(DS.grade2)===true && validatornum(DS.grade3)===true && validatornum(DS.grade4)===true && validatornum(DS.grade5)===true
    }
    var countStatus:Int=0
    fun numberStudents():Int{
        Log.i("PRUEBA",listStudents.count().toString())
        return listStudents.count()}

    fun statusNumberStudents(status:String):Int{
        for (item in listStudents){
            if(item.status==status){
                countStatus += 1
            }
        }
        return countStatus
    }
}