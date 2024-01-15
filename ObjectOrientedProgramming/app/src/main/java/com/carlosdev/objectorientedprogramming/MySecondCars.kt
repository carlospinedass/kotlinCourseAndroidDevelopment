package com.carlosdev.objectorientedprogramming

// El constructor secundario podemos definir diferentes constructores con diferentes parámetros
class MySecondCars {
    var name: String? = null

    //    private var model: Int? = null // Definimos tanto el método get y set como privado
    var model: Int? = null
        private set // Podemos definir como privado el set, pero también podemos definir que el get
        get // sea público

    // Secondary constructor
    constructor()

    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }
}