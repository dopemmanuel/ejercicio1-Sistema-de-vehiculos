package com.dam1.ejercicio1.src

import com.dam1.ejercicio1.src.clases.Vehiculo
import com.dam1.ejercicio1.src.clases.Automovil
import com.dam1.ejercicio1.src.clases.Motocicleta

fun main() {

    val vehiculo1 = Vehiculo("BMW", "X5", 100)
    val vehiculo2 = Vehiculo("Honda", "Civic", 100)
    val vehiculo3 = Automovil("", "", 100)
    val vehiculo4 = Motocicleta("", "", 100)

    vehiculo1.mostrarInfo()
    vehiculo2.mostrarInfo()
    vehiculo3.mostrarInfo()
    vehiculo4.mostrarInfo()

    println("Autonomia del vehiculo1: ${vehiculo1.calcularAutonomia()}")
    println("Autonomia del vehiculo2: ${vehiculo2.calcularAutonomia()}")
    println("Autonomia del vehiculo3: ${vehiculo3.calcularAutonomia()}")
    println("Autonomia del vehiculo4: ${vehiculo4.calcularAutonomia()}")
}