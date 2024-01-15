package com.carlosdev.objectorientedprogramming.abstracts

// Debemos definir la keyword abstract antes de definir la clase
// Las clases abstractas en Kotlin no pueden ser distanciadas directamente tampoco puedes usar los
// métodos directamente debes primero heredarla en otra clase
abstract class Vehicle {

    // abstract function
    abstract fun vehicleName(name: String) : String

    // non-abstract function
    fun vehicleType(type: String) : String {
        return type
    }

    // abstract properties
    abstract var model: Int

    // non-abstract
    var speed:Int? = null
}