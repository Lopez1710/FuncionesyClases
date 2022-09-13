package com.example.funcionesyclases

class Estudiantes(val nombre:String, var edad:Int, var lenguajes:Array<leng>, val amigo:Array<Estudiantes>?=null) {

    enum class leng{
        kotlin,
        php,
        java,
        C,
        JavaScript,
        python

    }
    fun codigo(){
        for(lenguaje:leng in lenguajes){
            println("Los lenguajes de programacion que conoses son $lenguaje")
        }

    }
}