package com.carlosdev.objectorientedprogramming

// En Kotlin debemos definir open en una clase si queremos que sea heredada, de lo contrario no
// permite herencia, por defecto es final
open class Vehicle {
    var type: String? = null;
    var model: String? = null;
    var maxSpeed: Int? = null;

    fun show() {
        println("Type: $type")
        println("Model: $model")
        println("Max Speed: $maxSpeed")
    }
}