package com.dam1.ejercicio1.src.clases


class Motocicleta(
    marca: String,
    modelo: String,
    capacidadCombustible: Int
): Vehiculo("supercat", "moto", 100){
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }
}