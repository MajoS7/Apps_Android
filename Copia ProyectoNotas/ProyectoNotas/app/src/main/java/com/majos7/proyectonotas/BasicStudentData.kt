package com.majos7.proyectonotas

class BasicStudentData: StudentSubjects() {

    var document:String=""
    var name:String=""
    var age:Int=0
    var phone:String=""
    var address:String=""
    var listStudentSubjects:MutableList<StudentSubjects> = mutableListOf()
    var promedio:Double=0.0

}