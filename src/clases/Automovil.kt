package com.dam1.ejercicio1.src.clases


class Automovil(
    marca: String,
    modelo: String,
    capacidadCombustible: Int
): Vehiculo("sedan", "deportivo", 100){

    override fun calcularAutonomia(): Int{
        return super.calcularAutonomia() + 100
    }
}