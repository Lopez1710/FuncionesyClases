package com.example.funcionesyclases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //arrays()
        //seguridadNula()
        //funciones()
        clases()
    }


    fun arrays(){
    val nombre = "Wilfredo"
    val apellido = "Lopez"
    val departamento ="Chalatenango"
    val edad = "20"


    val arreglo = arrayListOf<String>()

        arreglo.add(nombre)
        arreglo.add(apellido)
        arreglo.add(departamento)
        arreglo.add(edad)

        println(arreglo)
        for (i in arreglo){
            println(i)
        }

        arreglo.addAll(listOf("Estudiante", "Programacion IV"))

        println(arreglo)

        var miDepar = arreglo[2]
        println(arreglo[2])

        arreglo[0] = "Alvaro"
        println(arreglo)

        arreglo.removeAt(2)
        println(arreglo)

        arreglo.forEach{
            println(it)
        }

        println(arreglo.count())
        arreglo.clear()
        println(arreglo.count())
    }
    fun seguridadNula(){
        var miString:String="Programacion IV 13/09/2022"
        //miString=null
        println(miString)

        var noNulo:String? = "valor de seguridad nula"

        println(noNulo)
        noNulo= null

        println(noNulo)

        noNulo= "Asignamos nuevo valor"

        if (noNulo != null)
        {
            println(noNulo.toString()!!)
        }else{
            println(noNulo.toString())
        }

        println(noNulo.length)
        noNulo= null
        noNulo.let {
            println(it.toString())
        }?:kotlin.run {
            println(noNulo)
        }
    }

    fun funciones(){
        decirHola()

        decirNombre("Wilfredo")
        decirNombreEdad("Carlos",20)
        val r =sumaDosNumeros(2,2)
        println("La suma es $r")
        println(sumaDosNumeros(2,sumaDosNumeros(3,7)))
    }

    fun decirHola(){
        println("Hola Estudiante")
    }

    fun decirNombre(nombre:String){
        println("Hola tu nombre es $nombre")
    }

    fun decirNombreEdad(nombre:String,edad:Int){
        println("Hola tu nombre es $nombre y tu edad es $edad años")
    }

    fun sumaDosNumeros(num1:Int,num2:Int):Int{

        var suma = num1+num2
        return suma
    }

    fun clases(){
    val persona = Estudiantes("Roberto", 20,arrayOf(Estudiantes.leng.C,Estudiantes.leng.java))

        println(persona.edad)
        persona.edad=22
        println(persona.edad)
        println(persona.codigo())

    val persona2 = Estudiantes("Nelson", 20,arrayOf(Estudiantes.leng.JavaScript), arrayOf(persona))
        println(persona2.codigo())

        println("${persona2.amigo?.first()?.nombre} es amigo de ${persona2.nombre}")
    }
}


