package com.majos7.proyectonotas

class Operations {
    var BDStudent:BasicStudentData=BasicStudentData()
    var listStudent =arrayListOf<BasicStudentData>()

    fun registerStudent(dataStudent: BasicStudentData,subjectsStudent:StudentSubjects){
        BDStudent.listStudentSubjects.add(subjectsStudent)
        listStudent.add(dataStudent)
    }
}