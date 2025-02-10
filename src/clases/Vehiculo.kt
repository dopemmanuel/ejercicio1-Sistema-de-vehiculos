package com.dam1.ejercicio1.src.clases

open class Vehiculo(
    val marca: String,
    val modelo: String,
    val capacidadCombustible: Int){


    open fun mostrarInfo(){
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("CapacidadCombustible: $capacidadCombustible L.")
        println("")
        println("----".repeat(10))
    }
    open fun calcularAutonomia(): Int{
        return capacidadCombustible * 10
    }
}